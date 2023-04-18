
fun main() {
    var x = 1
    fun nome(nome_pessoa: String.Companion): String{
        println("Insira o nome: ")
        var nome_pessoa = readln().toString()
        return nome_pessoa
    }
    fun idade(idade_pessoa:Int.Companion): Int{
        println("Insira a idade: ")
        var idade_pessoa = readln().toInt()
        return idade_pessoa
    }
    while (x==1){
        println("Ola! Por gentileza informe o que voce quer fazer:")
        println("1 - Adicionar nome e idade")
        println("2 - Exibir a lista de nomes e idades")
        println("3 - Procurar por nome")
        println("4 - Remover nome")
        println("5 - Pesquisar nome")
        println("6 - Sair")
        var acao = readln().toInt()
        if (acao==1){
                nome_idade.addAll(nome(nome_pessoa = String), idade(idade_pessoa = Int))
                println("O nome e idade adicionados é: "+ nome_idade)
                println()
        }
        if (acao ==2) {

            println(nome_idade)
        }
        if (acao==6 ){
                x=0
            }
        }
}


