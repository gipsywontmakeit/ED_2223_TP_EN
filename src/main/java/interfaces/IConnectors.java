package interfaces;

import graphs.Graph;
import lists.LinkedList;
import locals.Coordinates;

public interface IConnectors<T> {

    public void addConnector(LinkedList<T> connector);

    public void removeConnector(Graph<T> vertex);

    public void updateConnector(Graph<T> oldVertex, Graph<T> newVertex);

    public void listConnector();

    public IGameSettingsConnector getGameSettingsConnector();

}
