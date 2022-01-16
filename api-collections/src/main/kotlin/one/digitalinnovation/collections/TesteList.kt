package one.digitalinnovation.collections

fun main() {
    val vinicios = Funcionario("Vinicios", 2000.0, "CLT")
    val carlos = Funcionario("Carlos", 1500.0, "PJ")
    val victor = Funcionario("Victor", 4000.0, "CLT")

    val funcionarios = listOf(vinicios, carlos, victor)

    funcionarios.forEach { println(it) }

    println("-----------------")
    println("Salario mais alto")
    println(funcionarios.find { it.nome == "Victor" })

    println("------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}