package encapsulamentoAbstracaoPolimorfismo.automoveis;

public class Carro extends Veiculo{


    public void ligarVeiculo() {
        confereCambio();
        confereCombustível();
        System.out.println("Ligando!");
    }

    private void confereCombustível() {
        System.out.println("Conferindo Combustível!");
    }

    private void confereCambio() {
        System.out.println("Conferindo Câmbio!");
    }

}
