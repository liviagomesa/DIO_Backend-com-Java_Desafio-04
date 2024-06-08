interface AparelhoTelefonico { // definido como interface pois o iPhone precisará herdar os métodos e atributos
                               // de 3 classes diferentes
    default void ligar(String numero) {
        System.out.println("Telefone ligando para " + numero);
    }

    default void atender() {
        System.out.println("Você atendeu a chamada, diga alô!");
    }

    default void iniciarCorreioVoz() {
        System.out.println("Telefone gravando correio de voz, deixe sua mensagem!");
    }
}
