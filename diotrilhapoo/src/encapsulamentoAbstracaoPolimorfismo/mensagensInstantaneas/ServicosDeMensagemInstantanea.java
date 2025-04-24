package encapsulamentoAbstracaoPolimorfismo.mensagensInstantaneas;

public abstract class ServicosDeMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // métodos privadas, visíveis somente na classe
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
