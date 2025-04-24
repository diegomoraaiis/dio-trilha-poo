package EnumExemplo;
public class SisemaIbge {
    public static void main(String[] args) {
        for(EstadosBrasieiros x : EstadosBrasieiros.values()){
            System.out.println(x.getSigla() + " - " + x.getNome());
        }

        //EstadosBrasieiros y = EstadosBrasieiros.ACRE;

        //System.out.println("Nome..: "+ y.getNomeMaiusculo() + ", sigla..: "+y.getSigla());
    }
}
