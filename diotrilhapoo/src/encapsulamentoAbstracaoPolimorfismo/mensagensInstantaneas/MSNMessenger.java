package encapsulamentoAbstracaoPolimorfismo.mensagensInstantaneas;

public class MSNMessenger extends ServicosDeMensagemInstantanea {
   
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Mensagem do MSN messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Receber mensagem do MSN messenger");
    }
}
