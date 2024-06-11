public class AparelhoTelefonico {
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }

    public void receberSMS(String mensagem) {
        System.out.println("Recebendo SMS: " + mensagem);
    }
}
