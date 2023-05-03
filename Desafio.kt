fun main() {
/* OBS: Não consegui fazer  o if else receber a conta formatada,
   por isso o resultado do grau de obesidade não está certo, porém
   o IMC está, obrigado.
 */
println("🏋️ Calculadora de IMC 🧮 \n")


println("Entre com seu peso")
var peso = readLine()!!.toDouble()


println("Entre com sua altura")
var altura = readLine()!!.toDouble()


println("\n")


var imc= peso /(altura * altura)


var imcFormatado = "%.4f".format(imc)


var imcFinal = imcFormatado.substring(0, 4)

println("Carregando Resposta....  \n")

println("Seu IMC é: $imcFinal \n")

if (imc < 17) {
    println("Você está muito abaixo do peso \n")
    println("Grau de obesidade: 0 \n")
}
else if (imc >=17.1 && imc >= 18.5) {
    println("Você está abaixo do peso \n")
    println("Grau de obesidade: 0 \n")
}
else if (imc >= 18.5 && imc <= 24.9) {
    println("Você está com peso normal \n")
    println("Grau de obesidade: 0 \n")
}
else if (imc >= 25 && imc <= 29.9) {
    println("Você está com sobrepeso \n")
    println("Grau de obesidade: 1º \n")
}
else if (imc >= 30 && imc >= 39.9) {
    println("Você está acima do peso \n")
    println("Grau de obesidade: 2º \n")
}
else if (imc > 40) {
    println("Você está muito acima do peso \n")
    println("Grau de obesidade: 3º \n")
}
else{
    println("Peso ou altura inválidos \n")
}
}