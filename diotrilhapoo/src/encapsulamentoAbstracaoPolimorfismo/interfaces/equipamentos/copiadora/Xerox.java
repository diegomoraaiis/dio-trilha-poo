package encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.copiadora;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("XEROX - COPIANDO...");
    }
}
