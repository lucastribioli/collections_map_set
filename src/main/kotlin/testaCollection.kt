
fun testaCopia(){
    val bancoDeNomes: BancoDeNomes = BancoDeNomes()
    val nomesSalvos: Collection<String> = bancoDeNomes.nomes
    bancoDeNomes.salva("Lucas")
    bancoDeNomes.salva("João")
    println(bancoDeNomes.nomes)
    println(nomesSalvos)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}
fun testaColecao(){
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Lucas",
        "João",
        "Maria"
    )
}