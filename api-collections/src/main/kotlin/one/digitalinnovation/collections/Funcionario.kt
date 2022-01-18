package one.digitalinnovation.collections

class Funcionario(
   override val nome: String,
   override val cpf: String,
   val salario: String

) : Pessoa(nome, cpf) {

}




