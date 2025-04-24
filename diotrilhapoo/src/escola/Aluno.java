package escola;

public class Aluno {
    private String nome = "";
    private int idade = 0;
    private String sexo;
    private String cor;
    private boolean estudando;

    

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEstudando(boolean estudando) {
        this.estudando = estudando;
    }
    
    public String getEstudando(){
        if(this.estudando == true){
            return "esta estudando";
        } else{
            return "não está estudando";
        }
    }
}
   