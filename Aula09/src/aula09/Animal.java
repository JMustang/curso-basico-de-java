package aula09;
public abstract class Animal {
    // Atributos
    protected float peso;
    protected int idade, mombros;
    // Metodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMombros() {
        return mombros;
    }

    public void setMombros(int mombros) {
        this.mombros = mombros;
    }
    
}
