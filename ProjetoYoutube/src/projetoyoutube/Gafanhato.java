package projetoyoutube;
public class Gafanhato extends Pessoa{
    private String login;
    private int totAssistindo;

    public Gafanhato(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistindo = 0;
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhato\n{" + super.toString()
                + "\nlogin: " + login + 
                ", \ntotAssistindo: " + totAssistindo + 
                "\n}";
    }
    
    
    
    
}
