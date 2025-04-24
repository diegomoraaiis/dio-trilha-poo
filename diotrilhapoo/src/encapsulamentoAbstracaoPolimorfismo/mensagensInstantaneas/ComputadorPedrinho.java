package encapsulamentoAbstracaoPolimorfismo.mensagensInstantaneas;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        Telegram tlg = new Telegram();
        FacebookMessenger fcb = new FacebookMessenger();

       
        msn.enviarMensagem();
        System.out.println("");
        fcb.enviarMensagem();
        System.out.println("");
        tlg.enviarMensagem();

    }

}
