package encapsulamentoAbstracaoPolimorfismo.mensagensInstantaneas;

public class Telegram extends ServicosDeMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Mensagem do Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Receber mensagem do Telegram");
    }
}
