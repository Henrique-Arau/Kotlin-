package one.digitalinnovation.collections

class Pessoa {

    var nome: String = "Caio"
    var cpf: String = "123.123.123.11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


    inner class Endereco {
        var rua: String = "Rua teste"
    }

}

fun main() {

    val caio = Pessoa()

    println(caio)

    println(caio.pessoaInfo())
    println(caio.nome)
    println(caio.cpf)

    println(caio.Endereco().rua)
}