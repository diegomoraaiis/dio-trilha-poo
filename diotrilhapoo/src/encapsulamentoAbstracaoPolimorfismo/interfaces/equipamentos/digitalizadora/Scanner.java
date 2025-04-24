package encapsulamentoAbstracaoPolimorfismo.interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{
  @Override
  public void digitalizar() {
    System.out.println("DIGITALIZADORA - DIGITALIZANDO");
      
  }
}
