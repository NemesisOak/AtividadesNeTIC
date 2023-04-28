fun fatorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * fatorial(n - 1)
    }
}

fun fibonacci(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun mdc(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return mdc(b, a % b)
    }
}

fun isPalindrome(str: String): Boolean {

    if (str.length < 2) {
        return true
    }


    return if (str.first() == str.last()) {
        isPalindrome(str.substring(1, str.length - 1))
    } else {
        false
    }
}

fun main() {
    println(isPalindrome("ana"))  // true
    println(isPalindrome("arara"))  // true
    println(isPalindrome("abc"))  // false
    println(isPalindrome("a"))  // true
    println(isPalindrome(""))  // true
}

fun somarArray(array: IntArray, index: Int = 0): Int {
    if (index == array.size) {
        return 0
    }
    return array[index] + somarArray(array, index + 1)
}
val array = intArrayOf(1, 2, 3, 4, 5)
val resultado = somarArray(array)

fun main(){
    val numeros = listOf(4, 2, 7, 1, 3, 6, 5)

    val numerosOrdenados = numeros.sortedBy { it }

    println(numerosOrdenados)
}

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val multipliedNumbers = numbers.map { it * 2 } // aplica a multiplicação em cada elemento
    println(multipliedNumbers)
}

fun main(){
    val numeros = listOf(1, 2, 3, 4, 5)

// Filtra números pares
    val numerosPares = numeros.filter { it % 2 == 0 }

// Filtra números maiores que 3
    val numerosMaioresQue3 = numeros.filter { it > 3 }
}

fun main(){
    val lista = listOf(10, 20, 5, 15, 30)
    val maximo = lista.maxByOrNull { it }
    println(maximo)
}

fun main(){
    val lista = listOf(1, 2, 3, 4, 5)
    val soma = lista.reduce { acc, i -> acc + i }
    println(soma) // Output: 15

}

fun soma(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

fun main() {
    val a = 2
    val b = 3
    val resultado = soma(a, b) { x, y -> x + y }
    println("A soma de $a e $b é $resultado")
}

fun repeatMessage(n: Int, message: () -> Unit) {
    for (i in 1..n) {
        message()
    }
}

fun main() {
    repeatMessage(5) {
        println("Mensagem a ser repetida!")
    }
}