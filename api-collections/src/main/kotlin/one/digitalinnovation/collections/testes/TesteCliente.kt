package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Cliente
import one.digitalinnovation.collections.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da silva",
        cpf = "123.123.456.77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}



