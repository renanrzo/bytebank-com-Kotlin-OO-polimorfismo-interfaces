fun testaFuncionarios() {
    val renan = Analista(
        nome = "Renan",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    val mariane = Gerente(
        nome = "Mariane",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 124
    )
    println("nome: ${renan.nome}")
    println("cpf: ${renan.cpf}")
    println("salario: ${renan.salario}")
    println("bonificação: ${renan.bonificacao}")
    println()
    println("nome: ${mariane.nome}")
    println("cpf: ${mariane.cpf}")
    println("salario: ${mariane.salario}")
    println("bonificação: ${mariane.bonificacao}")
    if (mariane.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val warlla = Diretor(
        nome = "Warlla",
        cpf = "333.333.333-33",
        salario = 3500.0,
        senha = 4000,
        plr = 200.0
    )
    println(warlla.nome)
    println(warlla.cpf)
    println(warlla.salario)
//    println(warlla.senha)
    println(warlla.plr)

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = Calculadora()
    calculadora.registra(renan)
    calculadora.registra(mariane)
    calculadora.registra(warlla)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}