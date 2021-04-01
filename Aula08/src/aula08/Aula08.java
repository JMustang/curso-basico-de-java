package aula08;

public class Aula08 {
    public static void main(String[] args) {
//        Visitante v1 = new Visitante();
//        v1.setName("junior");
//        v1.setIdade(35);
//        v1.setSexo("M");
//        System.out.println(v1.toString());
         Aluno a1 = new Aluno();
         a1.setName("Alice");
         a1.setMatricula(1111);
         a1.setCurso("Desenho");
         a1.setIdade(9);
         a1.setSexo("Feminino");
         a1.pagarMensalidade();
         System.out.println(a1.toString());
         
         Bolsista b1 = new Bolsista();
         b1.setMatricula(1112);
         b1.setName("Murilo");
         b1.setBolsa(12.5f);
         b1.pagarMensalidade();
         b1.setSexo("Masculino");
         b1.setIdade(20);
         System.out.println(b1.toString());
    }
    
}
