public class App {
    public static void main(String[] args) throws Exception {
        Iphone iPhone = new Iphone();
        iPhone.ligar("27 99999-9999");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("We Are The Champions");
        iPhone.exibirPagina("https://github.com/liviagomesa");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
