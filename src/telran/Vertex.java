package telran;

public class Vertex {
    public Vertex left;
    public Vertex right;
    public double weight;

    public Vertex(Vertex left, Vertex right, double weight) {
        this.left = left;
        this.right = right;
        this.weight = weight;
    }
}
