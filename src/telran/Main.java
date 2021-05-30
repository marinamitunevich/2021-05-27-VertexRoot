package telran;

public class Main {
    public static void main(String[] args) {
        Vertex v1 = new Vertex( null, null,7);
        Vertex v5 = new Vertex(null, null,8);
        Vertex v2 = new Vertex(v1,null,2);
        Vertex v7 = new Vertex( null, null,3);
        Vertex v6 = new Vertex(v7, null,4);
        Vertex v4 = new Vertex(v5,v6,8);
        Vertex v3 = new Vertex(v2,v4,6); //root
    }
}
