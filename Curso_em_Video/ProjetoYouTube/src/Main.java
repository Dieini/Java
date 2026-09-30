//package projetoyoutube;
public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Curso Java - Gustavo Guanabara");
        v[1] = new Video("Aula de Canto Soprano");
        v[2] = new Video("Bolo de Chocolate - Ana Maria Braga");

        Gafanhoto g[] = new Gafanhoto[4];
        g[0] = new Gafanhoto("Laura",16,"Feminino","lau_soarez");
        g[1] = new Gafanhoto("Pedro", 27, "Masculino", "pd@027");
        g[2] = new Gafanhoto("Fabiana", 20, "Feminino", "Fabi_Arante");
        g[3] = new Gafanhoto("Gabriel",15, "Masculino", "BL_fonseca");


        Visualizacao vis[] = new Visualizacao[3];

        vis[0] = new Visualizacao(g[3],v[0]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        System.out.println("----------------------------------------");

        vis[1] = new Visualizacao(g[3], v[1]);
        vis[1].avaliar(45);
        System.out.println(vis[1]);
        System.out.println("----------------------------------------");

        vis[2] = new Visualizacao(g[2], v[2]);
        v[2].play();
        v[2].like();
        System.out.println(vis[2]);
        System.out.println("----------------------------------------");


    }
}
