package encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.multifuncional;

import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.copiadora.Copiadora;
import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora{

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    
}
