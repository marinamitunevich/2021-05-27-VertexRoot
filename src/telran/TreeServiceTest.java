package telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeServiceTest {
    TreeService treeService = new TreeService();

    @Test
    void countVertices() {
        Vertex v1 = new Vertex( null, null,7);
        Vertex v5 = new Vertex(null, null,6);
        Vertex v2 = new Vertex(v1,null,15);
        Vertex v7 = new Vertex( null, null,4);
        Vertex v6 = new Vertex(v7, null,2);
        Vertex v4 = new Vertex(v5,v6,1);
        Vertex root = new Vertex(v2,v4,3); //root
        assertEquals(7,treeService.countVertices(root));

    }
    @Test
    void test_getHeight(){
        Vertex v1 = new Vertex( null, null,7);
        Vertex v5 = new Vertex(null, null,6);
        Vertex v2 = new Vertex(v1,null,6);
        Vertex v7 = new Vertex( null, null,4);
        Vertex v6 = new Vertex(v7, null,2);
        Vertex v4 = new Vertex(v5,v6,1);
        Vertex root = new Vertex(v2,v4,3); //root
        assertEquals(3,treeService.getHeight(root));

    }
    @Test
    void test_getWeight(){
        Vertex v1 = new Vertex( null, null,7);
        Vertex v5 = new Vertex(null, null,6);
        Vertex v2 = new Vertex(v1,null,6);
        Vertex v7 = new Vertex( null, null,4);
        Vertex v6 = new Vertex(v7, null,2);
        Vertex v4 = new Vertex(v5,v6,1);
        Vertex root = new Vertex(v2,v4,3); //root
        assertEquals(29,treeService.getWeight(root));

    }
}