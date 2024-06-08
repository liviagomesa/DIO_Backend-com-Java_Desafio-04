interface ReprodutorMusical {
    default void tocar() {
        System.out.println("Música tocando no reprodutor musical");
    }

    default void pausar() {
        System.out.println("Música pausada");
    }

    default void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada no reprodutor musical");
    }
}
