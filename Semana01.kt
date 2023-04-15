/*As diferenças principais entre Java e Kotlin  são que em Kotlin os tipos primitivos são objetos,
seu tempo de compilação é maior do que o de Java, não há necessidade de declarar variáveis e não
é necessário declarar o tipo de variável de forma explicita.
*/

fun main() {
    //Variaveis e Constantes
    var a = 10 //Var porque este número pode ser mudado
    val b = 5 //Val porque este número é definido apenas uma vez

    //Tipo de Dados
    val c: Double
    c = 1.1
    var d: String
    d = "variavel string"
    var e: Int
    e = 3

    //Operadores
    print("Digite  o primeiro número: ")
    val n1 = readln().toInt()
    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    val soma = n1 + n2
    print(soma)

    var res1 : Boolean
    res1 = 5>3&&2<4
    print(res1)

    var res2 : Boolean
    res2 = (10>5||3<1)
    print(res2)

fun Entrada_Saida() {
    print("Digite  o primeiro número: ")
    val n1 = readln().toInt()
    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    print ("Insira o número: ")
    val num = readln().toInt()
    val quad = num * num
    print (quad)

    println("Qual seu nome? ")
    val nome = readln().toString()
    println("Qual sua idade? ")
    val idade = readln().toInt()

    print(nome)
    println(", seja bem vindo(a)")
    print(idade)
    println(" anos é uma otima idade para se ter"
}

fun if_else() {
    print("Insira a primeira nota: ")
    val n1 = readln().toInt()
    println("Insira a segunda nota: ")
    val n2 = readln().toInt()

    val media = (n1 + n2)/2
    if (media > 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    println("Qual o número: ")
    val n1 = readln().toInt()
    var teste = n1%2
    if (teste==0){
        print("Número par")
    } else {
        println("Número impar")
    }
}