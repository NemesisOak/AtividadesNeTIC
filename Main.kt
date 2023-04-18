fun main() {
    println("Boa noite!")
    println("Escolha a função da calculadora:")
    println("1-Soma" +
            "2-Subtração" +
            "3-Multiplicação" +
            "4-Divisão" +
            "5-Potenciação" +
            "6-Raiz")
    val funcao = readln().toInt()
    println("Insira o primeiro número: ")
    val a = readln().toInt()
    println("Insira o segundo número: ")
    val b = readln().toInt()
    when (funcao) {
        1 -> sum(a, b)
        2 -> sub(a, b)
        3 -> mult(a, b)
        4 -> div(a, b)
        5 -> exp(a, b)
       /* 6 -> rai(a, b)*/
        else -> {
            print("Opção inválida")
        }
    }
}
fun sum(a: Int, b: Int): Unit {
    val primresultado = a + b
    return print("O resultado da soma é: "+ primresultado)
}
fun mult(a :Int, b:Int): Unit{
    var secresultado = a * b
    return print("O resultado da divisão é: "+ secresultado)
}
fun exp(a:Int, b:Int): Unit{
    var tercresultado = a *  a
    return print("O resultado do exponencial é: "+ tercresultado)
}

fun sub(a:Int, b:Int): Unit {
    var quartresultado = a - b
    return print("O resultado da subtração é: " + quartresultado)
}
fun div(a:Int, b:Int): Unit {
    var quintresultado = a / b
    return print("O resultado da divisão é: " + quintresultado)
}
/*fun rai(a:Int, b:Int): Unit{
    val sexresultado = a sqrt(a)
            return print("O resultado da raiz é: "+ sexresultado)
}
*/