fun soma (a: Int, b: Int){
    return (a + b)
}

fun main (){
    var resultado1 = soma(5,5)
    println(resultado1)
}

fun par (numero: Int): Boolean {
    return numero % 2 == 0
}

fun main(){
    var resultado2 = par(4)
    println(resultado2)
}

fun palindromo (str: String): Boolean {
    val strReversa = str.reversed()
    return str == strReversa
}

fun main(){

    var resultado3 = palindromo("Arara")
    println(resultado3)

}

fun maiorValor(array: IntArray): Int {
    var maior = Int.MIN_VALUE
    for (numero in array) {
        if (numero > maior) {
            maior = numero
        }
    }
    return maior
}

fun main(){

    val array = intArrayOf(1, 2, 5, 2, 7, 9, 2)
    val maior = maiorValor(array)
    println("O maior valor do array é $maior")

}

fun filtrarStrings(array: Array<String>): List<String> {
    return array.filter { it.length > 5 }
}

fun main(){

    val array = arrayOf("Vasco", "CRVG", "Melhor", "Time", "do Mundo")
    val resultado5 = filtrarStrings(array)
    println(resultado5)

}

fun somar(vararg numeros: Int): Int {
    return numeros.sum()
}

fun main(){

    val resultado6 = somar(5, 6, 7, 8, 9)
    println(resultado6)

}

fun maioresQueN(array: Array<Int>, n: Int): List<Int> {
    val maiores = mutableListOf<Int>()
    for (elemento in array) {
        if (elemento > n) {
            maiores.add(elemento)
        }
    }
    return maiores
}

fun main(){

    val numeros = arrayOf(1,2,3,4,5,6,7)
    val n = 5
    val resultado7 = maioresQueN(numeros, n)
    println(resultado7)

}

fun multiplosDeN(array: Array<Int>, n: Int): List<Int> {
    val resultado = mutableListOf<Int>()
    for (i in array.indices) {
        if (i % n == 0) {
            resultado.add(array[i])
        }
    }
    return resultado
}

fun main(){

    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val n = 3
    val resultado8 = multiplosDeN(array, n)
    println(resultado8)

}

val resultado9 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) {
    println(resultado9)
}
val resultado10 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) {
    resultado10.add(10, 11)
    println(resultado10)
}
val resulatdo11 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11) {
    resultado11 = removeLast()
    println(resultado11)
}
