package encapsulamentoAbstracaoPolimorfismo.automoveis;

public abstract class Veiculo {
    private int chassi;
    private String tipo;
    private String marca;
    private String cor;

    public void veiculo() {
        this.chassi = 0;
        this.tipo = "x";
        this.marca = "x";
        this.cor = "x";
    }

    public abstract void ligarVeiculo();

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
