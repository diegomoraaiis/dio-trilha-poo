package encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.impressora;

public class Laserjet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("IMPRESSORA LASERJET - IMPRIMINDO");
        
    }
}
