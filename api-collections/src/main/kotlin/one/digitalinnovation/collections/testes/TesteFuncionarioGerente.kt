package one.digitalinnovation.collections.testes


import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Gerente

fun main() {


    val henrique = Gerente("Henrique araujo", "12323434577", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(henrique)

    TesteAutenticacao().autentica(henrique)

}
