class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, ) {
       if (admin.autentica(senha)) {
           println("bem vindo ao bytebank")
       } else {
           println("falha na autenticação")
       }
    }

}