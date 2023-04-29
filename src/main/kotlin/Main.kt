fun main(args: Array<String>) {
    val bancoDeNomes: BancoDeNomes = BancoDeNomes()
    bancoDeNomes.salva("Lucas")
    println(bancoDeNomes.nomes)



}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

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