package one.digitalinnovation.collections.testes


import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Gerente

fun main() {


    val Henrique = Gerente("Henrique araujo", "12323434577", 5000.0)

    ImprimeRelatorioFuncionario.imprime(Henrique)

}
