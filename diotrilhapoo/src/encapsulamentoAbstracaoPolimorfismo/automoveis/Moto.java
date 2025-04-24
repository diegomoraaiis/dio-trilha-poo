package encapsulamentoAbstracaoPolimorfismo.automoveis;

public class Moto extends Veiculo {
    
    public void ligarVeiculo() {
        confereAfogador();
        confereOleo();
        confereCombustível();
        System.out.println("Ligando");
    }

    private void confereCombustível() {
        System.out.println("Conferindo Combustível!");
    }

    private void confereOleo() {
        System.out.println("Conferindo Câmbio!");
    }
    private void confereAfogador(){
        System.out.println("Não está afogada!");
    }
}
