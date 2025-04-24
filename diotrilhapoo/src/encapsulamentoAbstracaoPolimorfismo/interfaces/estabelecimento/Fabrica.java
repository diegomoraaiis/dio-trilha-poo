package encapsulamentoAbstracaoPolimorfismo.interfaces.estabelecimento;


import encapsulamentoAbstracaoPolimorfismo.interfaces.Impressora;
import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.copiadora.Xerox;
import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.digitalizadora.Scanner;
import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.impressora.Laserjet;
import encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional eq = new EquipamentoMultifuncional();
        Laserjet imp = new Laserjet();
        Xerox xer = new Xerox();
        Scanner sca = new Scanner();
     
        eq.copiar();
        eq.digitalizar();
        eq.imprimir();

        imp.imprimir();
        xer.copiar();
        sca.digitalizar();

    }
}
