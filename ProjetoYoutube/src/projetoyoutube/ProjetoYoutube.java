package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Twe girls one cup");
        v[1] = new Video("Felipe Gringo");
        v[2] = new Video("Audios bizzarros do whatsapp");
        
        Gafanhato g[] = new Gafanhato[2];
        
        g[0] = new Gafanhato("Alice", "F", 9, "Aruci-chan");
        g[1] = new Gafanhato("junior", "M", 34, "Mustang");
//        
        Visualizacao w[] = new Visualizacao[5];
        w[0] = new Visualizacao(g[0], v[2]);
        w[0].avaliar(87.7f);
        System.out.println(w[0].toString());
        
//        w[2] = new Visualizacao(g[1], v[0]);
//        w[0].avaliar(87.7f);
//        System.out.println(w[1].toString());
////        
//        System.out.println("Video\n-----------------------------------");
//        System.out.println(v[0].toString());
//        System.out.println("Gafanhoto\n-----------------------------------");
//        System.out.println(g[0].toString());
    }
    
}
