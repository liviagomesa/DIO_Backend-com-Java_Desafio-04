interface NavegadorInternet {
    default void exibirPagina(String url) {
        System.out.println("Navegador exibindo a página " + url);
    }

    default void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador");
    }

    default void atualizarPagina() {
        System.out.println("Página atualizada no navegador");
    }
}