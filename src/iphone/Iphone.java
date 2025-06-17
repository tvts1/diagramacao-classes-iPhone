package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo chamada de " + numero + "...");
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz para " + numero + "...");
    }

    // Métodos do Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba aberta com: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método main para teste
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando funções do reprodutor musical
        meuIphone.selecionarMusica();
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funções do telefone
        meuIphone.ligar("99999-0000");
        meuIphone.atender("88888-1111");
        meuIphone.iniciarCorreioVoz("99999-0000");

        // Testando funções do navegador
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba("https://www.google.com");
        meuIphone.atualizarPagina();
    }
}
