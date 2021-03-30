package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        // Projeto principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setName("Pedro");
        p2.setName("Maria");
        p3.setName("Claudio");
        p4.setName("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        p3.setIdade(40);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.ReceberAumento(550.50f);
        p4.mudarTrabalho();
        p2.canselarMatricula();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
