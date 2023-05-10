import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main() {
    val file = File("Concessionária.csv")

    while (true) {
        println("Selecione a operação desejada:")
        println("1 - Criar tabela")
        println("2 - Ler tabela")
        println("3 - Editar tabela")
        println("4 - Adicionar linha à tabela")
        println("5 - Deletar linha da tabela")
        println("6 - Deletar tabela")
        println("7 - Sair")

        val opcao = readLine()?.toIntOrNull() ?: continue //verifica se o usuário escreveu alguma coisa, se não tiver escrito o menu é chamado novamente

        when (opcao) {
            1 -> criarTabela(file)
            2 -> lerTabela(file)
            3 -> editarTabela(file)
            4 -> adicionarLinha(file)
            5 -> deletarLinha(file)
            6 -> deletarTabela(file)
            7 -> return
            else -> println("Opção inválida")
        }
    }
}

fun criarTabela(file: File) {
    val writer = FileWriter(file)

    writer.write("Número,Modelo,Cor\n")
    writer.write("1,Opala SS,Vermelho\n")
    writer.write("2,General Lee,Laranja\n")
    writer.write("3,Fusca,Azul\n")
    writer.write("4,Chevette 1975,Marron\n")
    writer.write("5,Monza,Vermelho\n")
    writer.write("6,Rolls Royce,Verde\n")
    writer.write("7,Rolls Royce,Preto\n")
    writer.write("8,Brasília,Amarelo\n")
    writer.write("9,,Preto\n")
    writer.write("9,Dodge Chargher,Preto\n")
    writer.write("10,Ferrari 250 GTO,Vermelho\n")

    writer.close()

    println("Tabela criada com sucesso")
}

fun editarTabela(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines().toMutableList()
    reader.close()

    println("Digite o modelo do carro que deseja editar:")
    val nome = readLine() ?: return

    var index = -1
    for ((i, line) in lines.withIndex()) {
        val fields = line.split(",")
        if (fields[1] == modelo) {
            index = i
            break
        }
    }

    if (index == -1) {
        println("Carro não encontrado")
        return
    }

    println("Digite a cor do carro:")
    val tipo = readLine() ?: return

    val fields = lines[index].split(",").toMutableList()
    fields[2] = cor
    lines[index] = fields.joinToString(",")

    val writer = FileWriter(file)

    writer.write(lines.joinToString("\n"))

    writer.close()

    println("Carro editado com sucesso")
}

fun deletarLinha(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines().toMutableList()
    reader.close()

    println("Digite o modelo do Carro que deseja deletar:")
    val modelo = readLine() ?: return

    var index = -1
    for ((i, line) in lines.withIndex()) {
        val fields = line.split(",")
        if (fields[1] == modelo) {
            index = i
            break
        }
    }

    if (index == -1) {
        println("Carro não encontrado")
        return
    }

    lines.removeAt(index)

    val writer = FileWriter(file)

    writer.write(lines.joinToString("\n"))

    writer.close()

    println("Carro deletado com sucesso")
}

fun adicionarLinha(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines().toMutableList()
    reader.close()

    println("Digite o número do novo Carro:")
    val id = readLine() ?: return

    println("Digite o modelo do novo Carro:")
    val modelo = readLine() ?: return

    println("Digite a cor do novo Carro:")
    val cor = readLine() ?: return

    val novaLinha = "$id,$modelo,$cor"
    lines.add(novaLinha)

    val writer = FileWriter(file)

    writer.write(lines.joinToString("\n"))

    writer.close()

    println("Carro adicionado com sucesso")
}

fun lerTabela(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines()
    reader.close()

    if (lines.isEmpty()) {
        println("A tabela está vazia")
        return
    }

    for (line in lines) {
        val fields = line.split(",")
        val id = fields[0]
        val modelo = fields[1]
        val cor = fields[2]
        println("$id\t| $modelo\t| $cor")
    }
}

fun deletarTabela(file: File) {
    if (file.exists()) {
        file.delete()
        println("Tabela deletada com sucesso")
    } else {
        println("Tabela não encontrada")
    }
}