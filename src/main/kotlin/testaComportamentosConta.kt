fun testaComportamentosConta() {
    val contaRenan = ContaCorrente(titular = "Renan", numero = 1000)
    contaRenan.deposita(200.0)

    val contaMari = ContaPoupanca(numero = 1001, titular = "Mari")
    contaMari.deposita(300.0)

    println(contaMari.titular)
    println(contaMari.numero)
    println(contaMari.saldo)

    println(contaRenan.titular)
    println(contaRenan.numero)
    println(contaRenan.saldo)

    println("depositando na conta do Renan")
    contaRenan.deposita(50.0)
    println(contaRenan.saldo)

    println("depositando na conta da Mari")
    contaMari.deposita(70.0)
    println(contaMari.saldo)

    println("sacando na conta do Renan")
    contaRenan.saca(250.0)
    println(contaRenan.saldo)

    println("sacando na conta da Mari")
    contaMari.saca(100.0)
    println(contaMari.saldo)

    println("saque em excesso na conta do Renan")
    contaRenan.saca(100.0)
    println(contaRenan.saldo)

    println("saque em excesso na conta da Mari")
    contaMari.saca(500.0)
    println(contaMari.saldo)

    println("Transferência da conta da Mari para o Renan")

    if (contaMari.transfere(destino = contaRenan, valor = 300.0)) {
        println("Transferência bem sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaRenan.saldo)
    println(contaMari.saldo)
}