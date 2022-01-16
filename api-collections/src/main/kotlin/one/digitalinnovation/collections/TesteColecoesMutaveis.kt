package one.digitalinnovation.collections

fun main() {
    val vinicios = Funcionario("Vinicios", 2000.0, "CLT")
    val carlos = Funcionario("Carlos", 1500.0, "PJ")
    val victor = Funcionario("Victor", 4000.0, "CLT")

    println("--------- LIST ---------")
    val funcionarios = mutableListOf(vinicios, victor)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add(carlos)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.remove(carlos)
    funcionarios.forEach { println(it) }

    println("--------- SET ---------")
    val funcionarioSet = mutableSetOf(vinicios)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.add(carlos)
    funcionarioSet.add(victor)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.remove(victor)
    funcionarioSet.forEach { println(it) }
}