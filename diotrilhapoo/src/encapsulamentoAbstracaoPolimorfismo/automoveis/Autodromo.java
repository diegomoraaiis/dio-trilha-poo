package encapsulamentoAbstracaoPolimorfismo.automoveis;

public class Autodromo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        carro.ligarVeiculo();
        moto.ligarVeiculo();

        // Veiculo x = carro;
        // x.ligarVeiculo();
        
    }
}
