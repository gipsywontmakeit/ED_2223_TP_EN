package locals;

import graphs.Graph;
import interfaces.GraphMapADT;
import interfaces.ILocalManagement;
import interfaces.Local;
import lists.ArrayUnorderedList;

public class GraphMap<T> extends Graph<T> implements GraphMapADT<T> {

    LocalManagement localManagement;

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
            result += "" + i;
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

    public void printAllVertices() {
        ArrayUnorderedList<Locals> objects = (ArrayUnorderedList<Locals>) getAllVertices();
        for (Locals object : objects) {
            System.out.println(object);
        }
    }
}


