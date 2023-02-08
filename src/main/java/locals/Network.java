package locals;

import exceptions.EmptyCollectionException;
import exceptions.UnknownPathException;
import graphs.Graph;
import interfaces.NetworkADT;
import lists.ArrayUnorderedList;
import queues.LinkedQueue;
import queues.QueueADT;
import stacks.ArrayStack;
import stacks.StackADT;

import java.util.Iterator;


public class Network<T> extends Graph<T> implements NetworkADT<T> {

    @Override
    public void addEdge(T vertex1, T vertex2, double weight) throws EmptyCollectionException {

    }

    @Override
    public ArrayUnorderedList<T> shortestPathWeight(T vertex1, T vertex2) throws EmptyCollectionException, UnknownPathException {
        return null;
    }

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


}
