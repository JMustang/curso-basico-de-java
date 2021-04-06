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
        
        
        
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
