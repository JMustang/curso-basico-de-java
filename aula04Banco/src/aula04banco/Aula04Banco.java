package aula04banco;

public class Aula04Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Alice");
        p1.abrirConta("CC");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Junior");
        p2.abrirConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        
        
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
