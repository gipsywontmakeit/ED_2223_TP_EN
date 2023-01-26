package interfaces;

import graphs.Graph;
import graphs.GraphADT;

public interface GraphMapADT<T> extends GraphADT<T> {

    void updateVertex(T vertex, T newVertex);

}
