package locals;

import enums.LocalType;
import game_settings.GameSettings;
import game_settings.GameSettingsConnector;
import graphs.Graph;
import interfaces.IConnectors;
import interfaces.IGameSettingsConnector;
import lists.ArrayUnorderedList;
import lists.LinkedList;

public class Connectors<T> extends Locals implements IConnectors<T> {

    private Graph<T> graph;

    private LinkedList<T> connector;


    public Connectors(Graph<T> graph, LinkedList<T> connectors) {
        super(0, LocalType.Connector, null, null, new GameSettingsConnector(0, 0));
        this.graph = new Graph<>();
        this.connector = new LinkedList<>();
    }


    @Override
    public void addConnector(LinkedList<T> connector) {
        graph.addVertex((T) connector);
    }

    @Override
    public void removeConnector(Graph<T> vertex) {

    }

    @Override
    public void updateConnector(Graph<T> oldVertex, Graph<T> newVertex) {

    }

    @Override
    public void listConnector() {

    }

    @Override
    public IGameSettingsConnector getGameSettingsConnector() {
        return null;
    }
}
