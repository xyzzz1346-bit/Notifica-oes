public class Sms implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("enviando SMS: " + mensagem);
    }
}