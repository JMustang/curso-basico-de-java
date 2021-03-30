package projetopessoas;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;

    // Metodos
    public void canselarMatricula() {
        System.out.println("Matricula sera canselada!");
    }

    // Metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
