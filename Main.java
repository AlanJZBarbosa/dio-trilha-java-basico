
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        meuIphone.ligar();

        // Usando Reprodutor Musical
        ReprodutorMusical reprodutor = meuIphone.getReprodutorMusical();
        reprodutor.tocar();
        reprodutor.ajustarVolume(75);

        // Usando Aparelho Telefonico
        AparelhoTelefonico telefone = meuIphone.getAparelhoTelefonico();
        telefone.fazerChamada("123-456-7890");
        telefone.enviarSMS("123-456-7890", "Olá, tudo bem?");

        // Usando Navegador Internet
        NavegadorInternet navegador = meuIphone.getNavegadorInternet();
        navegador.acessarURL("https://www.exemplo.com");
        navegador.atualizarPagina();

        meuIphone.desligar();
    }
}
