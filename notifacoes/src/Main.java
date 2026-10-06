public class Main {

    public static void main(String[] args) {
        Notificador email = new Email();
        Notificador sms = new SMS();

        email.enviar(" thenightcorewizard is here ");
        sms.enviar(" thenightcorewizard is here ");
    }
}