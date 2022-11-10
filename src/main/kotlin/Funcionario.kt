package main.kotlin

class Funcionario(
    var nome: String,
    val cpf: String,
    val tipo: Int//0 = analista, gerente = 1, diretor = 2
) {
    var salario = 0.0


    fun bonificacao(): Double {
        when (tipo) {
            0 -> {
                salario += salario * 0.1
                return salario
            }
            1 -> {
                salario += salario * 0.2
                return salario
            }
            else -> {
                salario += salario * 0.3
                return salario
            }
        }
    }

}