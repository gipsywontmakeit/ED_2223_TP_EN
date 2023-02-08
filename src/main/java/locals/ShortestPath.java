package locals;

import graphs.Graph;
import graphs.GraphADT;
import interfaces.IConnector;
import interfaces.ILocal;
import interfaces.IPortal;
import lists.ArrayUnorderedList;
import lists.Node;

import java.util.Iterator;

public class ShortestPath {
    public static ArrayUnorderedList<ILocal> shortestPath(GraphADT graph, ILocal start, ILocal end) {
        ArrayUnorderedList<ILocal> path = new ArrayUnorderedList<>();

        Iterator<Node> iterator = graph.iteratorShortestPath(start, end);
        while(iterator.hasNext()) {
            Object vertex = iterator.next();
            if (vertex instanceof IPortal) {
                path.addToRear((IPortal) vertex);
            } else if (vertex instanceof IConnector) {
                path.addToRear((IConnector) vertex);
            }
        }
        return path;
    }
}
