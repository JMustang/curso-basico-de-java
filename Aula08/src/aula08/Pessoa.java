package aula08;

// classe abstrata.
public abstract class Pessoa {
    // parametros
    private String name, sexo;
    private int idade;

    // metodos
    public void fazerAnivarsario() {
        this.idade++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [idade: " + idade + ", name: " + name + ", sexo: " + sexo + "]";
    }

}
