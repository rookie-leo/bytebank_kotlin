package main.kotlin.br.com.alura.bytebank.models

/*
* logradouro;
número;
bairro;
cidade;
estado;
cep;
complemento.
* */

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
)
