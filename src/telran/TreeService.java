package telran;

public class TreeService {
    /**
     * @param root
     * @return
     */
    public int getHeight(Vertex root) {
        if (root == null) {
            return 0;
        } else {
            return Integer.max(getHeight(root.left), getHeight(root.right)) + 1;
        }

    }

    /**
     * the method must return the number of the vertices in the tree
     *
     * @param root
     * @return
     */
    public int countVertices(Vertex root) {
        if (root == null)
            return 0;
        return countVertices(root.left) + 1 + countVertices(root.right);

    }

    public double getWeight(Vertex root) {
        if (root == null)
            return 0;
        return getWeight(root.left) + root.weight + getWeight(root.right);

    }
}
