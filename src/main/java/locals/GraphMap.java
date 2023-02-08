package locals;

import graphs.Graph;
import interfaces.GraphMapADT;
import lists.ArrayUnorderedList;
import players.Players;
import queues.LinkedQueue;

import java.util.Iterator;

public class GraphMap<T> extends Graph<T> implements GraphMapADT<T> {
    private Graph<Locals> locais;
    LocalManagement localManagement;
    private int[][] edges;

    @Override
    public void updateVertex(T vertex, T newVertex) {

        int index = getIndex(vertex);
        if (index != -1) {
            vertices[index] = newVertex;

        }

    }

    @Override
    public String toString() {
        if (numVertices == 0)
            return "Graph is empty";

        String result = new String("");

        result += "Adjacency Matrix\n";
        result += "----------------\n";
        result += "index\t";

        for (int i = 0; i < numVertices; i++) {
            result  += "" + i;
            if (i < 10)
                result += " ";
        }
        result += "\n\n";

        for (int i = 0; i < numVertices; i++) {
            result += "" + i + "\t";

            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j])
                    result += "1 ";
                else
                    result += "0 ";
            }
            result += "\n";
        }

        result += "\n\nVertex Values";
        result += "\n-------------\n";
        result += "index\tvalue\n\n";

        for (int i = 0; i < numVertices; i++) {
            result += "" + i + "\t";
            result += vertices[i].toString() + "\n";
        }
        result += "\n";
        return result;
    }

    public ArrayUnorderedList<T> getAllVertices() {

        ArrayUnorderedList<T> verticesList = new ArrayUnorderedList<>();
        for (int i = 0; i < localManagement.getGraphMap().size() ; i++) {
            verticesList.addToRear(vertices[i]);
            System.out.println(vertices[i]);
        }
        return verticesList;
    }
    public ArrayUnorderedList<T> getVertex(T vertex) {
        ArrayUnorderedList<T> verticesList = new ArrayUnorderedList<>();
        for (int i = 0; i < localManagement.getGraphMap().size(); i++) {
            verticesList.addToRear(vertices[i]);
        }
        if (verticesList.contains(vertex)) {


        }

        return verticesList;
    }




    public Iterator<T> iteratorShortestPath(T startVertex, T targetVertex) {
        int startIndex = getIndex(startVertex);
        int targetIndex = getIndex(targetVertex);
        boolean[] visited = new boolean[vertices.length];
        int[] previous = new int[vertices.length];
        for (int i = 0; i < previous.length; i++) {
            previous[i] = -1;
        }
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(startIndex);
        visited[startIndex] = true;
        while (!queue.isEmpty()) {
            int currentIndex = queue.dequeue();
            if (currentIndex == targetIndex) {
                break;
            }
            for (int i = 0; i < vertices.length; i++) {
                if (edges[currentIndex][i] != 0 && !visited[i]) {
                    queue.enqueue(i);
                    visited[i] = true;
                    previous[i] = currentIndex;
                }
            }
        }
        ArrayUnorderedList<T> shortestPath = new ArrayUnorderedList<>();
        int currentIndex = targetIndex;
        while (currentIndex != -1) {
            shortestPath.addToRear(vertices[currentIndex]);
            currentIndex = previous[currentIndex];
        }
        return shortestPath.iterator();
    }




}


