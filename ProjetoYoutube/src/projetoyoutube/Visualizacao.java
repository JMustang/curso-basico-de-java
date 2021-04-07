package projetoyoutube;
public class Visualizacao {
    private Gafanhato espectador;
    private Video filme;

    public Visualizacao(Gafanhato espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porcent){
        int tot = 0;
        if(porcent <= 20){
            tot = 3;
        } else if(porcent <= 50){
            tot = 5;
        } else if (porcent <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhato getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhato espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    } 

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{\n" 
                + "\nespectador=" + espectador 
                + ", \nfilme=" + filme + '}';
    }
    
}
