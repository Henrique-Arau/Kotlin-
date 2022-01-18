package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main(){

    val caio = Pessoa(nome = "Caio rodrigues", cpf = "1234567899")
    println(caio.nome)
    println(caio.cpf)


    val joao = Pessoa(nome = "Joao rodrigues", cpf = "12323434577", BigDecimal.valueOf(200.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}