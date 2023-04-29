fun main(args: Array<String>) {
    testaSet()
    testaMap()
}

private fun testaMap(){
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 40.0), Pair(3, 40.0), 4 to 50)
    //infix ferra a performance
    println(pedidos)
    pedidos[0]?.let {
        println("pedido valor $it")
    }

}

private fun testaSet() {
    val assistiramCurso1 = setOf("Lucas", "Teste", "João")
    val assistiramCurso2 = setOf("Lucas", "Teste", "João", "Maria")
    val assistiramAmbos = assistiramCurso1 intersect assistiramCurso2
    println(assistiramAmbos)
}

