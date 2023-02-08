package locals;

import exceptions.EmptyCollectionException;
import exceptions.UnknownPathException;
import graphs.Graph;
import interfaces.NetworkADT;
import lists.ArrayUnorderedList;


public class Network<T> extends Graph<T> implements NetworkADT<T> {

    private class Edge<T> {
        private T vertex1;
        private T vertex2;
        private double weight;

        public Edge(T vertex1, T vertex2, double weight) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.weight = weight;
        }

        public T getVertex1() {
            return vertex1;
        }

        public T getVertex2() {
            return vertex2;
        }

        public double getWeight() {
            return weight;
        }
    }

    private ArrayUnorderedList<T> edges;

    protected ArrayUnorderedList<T> vertices;

    public Network() {
        this.edges = new ArrayUnorderedList<>();
    }

    @Override
    public void addEdge(T vertex1, T vertex2, double weight) throws EmptyCollectionException {
        Edge<T> edge = new Edge<>(vertex1, vertex2, weight);
        edges.addToRear((T) edge);
    }

    @Override
    public ArrayUnorderedList<T> shortestPathWeight(T vertex1, T vertex2) throws EmptyCollectionException, UnknownPathException {
        ArrayUnorderedList<T> shortestPath = new ArrayUnorderedList<>();
        if(!vertices.contains(vertex1) || !vertices.contains(vertex2)) {
            throw new UnknownPathException("Unknown path");
        }

        double[] distances = new double[vertices.size()];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = Double.MAX_VALUE;
        }
        distances[getIndex(vertex1)] = 0;

        boolean visited[] = new boolean[vertices.size()];

        T[] previous = (T[]) new Object[vertices.size()];

        PriorityQueue<T> queue = new PriorityQueue<>();
    }
}
