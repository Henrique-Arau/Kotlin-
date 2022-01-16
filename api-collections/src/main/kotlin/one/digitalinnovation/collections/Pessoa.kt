package one.digitalinnovation.collections

class Pessoa {

    var nome: String = "Caio"
    var cpf: String = "123.123.123.11"

}

fun main() {

    val caio = Pessoa()

    println(caio.nome)
    println(caio.cpf)
}