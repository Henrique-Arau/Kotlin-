package one.digitalinnovation.collections

fun main() {
    val vinicios = Funcionario("Vinicios", 2000.0, "CLT")
    val carlos = Funcionario("Carlos", 1500.0, "PJ")
    val victor = Funcionario("Victor", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(vinicios.nome, vinicios)
    repositorio.create(carlos.nome, carlos)
    repositorio.create(victor.nome, victor)

    println(repositorio.findById(victor.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(victor.nome)
    repositorio.findAll().forEach { println(it) }
}