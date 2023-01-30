package locals;

import interfaces.Connector;
import interfaces.ILocalManagement;
import interfaces.Local;
import interfaces.Portal;
import lists.ArrayUnorderedList;


public class LocalManagement implements ILocalManagement {

    GraphMap<Local> graphMap;

    public LocalManagement() {
        this.graphMap = new GraphMap<>();
    }

    @Override
    public void addLocal(Local local) {
        this.graphMap.addVertex(local);
    }

    @Override
    public void removeLocal(Local local) {
        this.graphMap.removeVertex(local);
    }

    @Override
    public void updateLocal(Local oldLocal, Local newLocal) {
        this.graphMap.updateVertex(oldLocal, newLocal);
    }

    @Override
    public Local getLocal(int id) {
        return null;
    }

    @Override
    public void addEdge(Local local1, Local local2) {
        this.graphMap.addEdge(local1, local2);
    }

    @Override
    public void removeEdge(Local local1, Local local2) {
        this.graphMap.removeEdge(local1, local2);
    }

    @Override
    public String toString() {
        return "LocalManagement{" +
                "graphMap=" + graphMap +
                '}';
    }

    @Override
    public GraphMap<Local> getGraphMap() {
        return this.graphMap;
    }

}
