package exerciciopratico;
public class ExercicioPratico {
    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l = new Livro[3];
       p[0] = new Pessoa("Pedro", 22, "M");
       p[1] = new Pessoa("Alice", 25, "F");
       
       l[0] = new Livro("O Hobbit", "JRR Tolkien", 380, p[0]);
       l[1] = new Livro("1984", "Gorge Owell", 400, p[1]);
       l[2] = new Livro("Os Tres Mosquetier", "Alexander dourmon", 400, p[0]);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
    }
    
}
