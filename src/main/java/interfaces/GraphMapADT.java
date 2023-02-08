package interfaces;

import graphs.Graph;
import graphs.GraphADT;
import players.Players;

public interface GraphMapADT<T> extends GraphADT<T> {

    void updateVertex(T vertex, T newVertex);

}
