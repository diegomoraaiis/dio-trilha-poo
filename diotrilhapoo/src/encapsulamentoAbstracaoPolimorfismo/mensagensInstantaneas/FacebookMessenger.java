package encapsulamentoAbstracaoPolimorfismo.mensagensInstantaneas;

public class FacebookMessenger extends ServicosDeMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Mensagem do facebook messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Receber mensagem do facebook");
    }
}
