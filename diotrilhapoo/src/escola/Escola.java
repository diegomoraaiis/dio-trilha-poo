package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Felipe");
        aluno.setIdade(30);
        aluno.setEstudando(false);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " Anos e " +  aluno.getEstudando());
       }
}
