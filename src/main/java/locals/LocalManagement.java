package locals;

import interfaces.ILocalManagement;
import interfaces.ILocal;


public class LocalManagement implements ILocalManagement {

    GraphMap<ILocal> graphMap;

    public LocalManagement() { this.graphMap = new GraphMap<>(); }

    @Override
    public void addLocal(ILocal local) {
        this.graphMap.addVertex(local);

    }


    @Override
    public void removeLocal(ILocal local) {
        this.graphMap.removeVertex(local);
    }

    @Override
    public void updateLocal(ILocal oldLocal, ILocal newLocal) {
        this.graphMap.updateVertex(oldLocal, newLocal);
    }

    @Override
    public ILocal getLocal(int id) {
        return null;
    }


    public void addEdge(ILocal local1, ILocal local2) {

        this.graphMap.addEdge(local1, local2);
    }


    @Override
    public void removeEdge(ILocal local1, ILocal local2) {
        this.graphMap.removeEdge(local1, local2);
    }

    @Override
    public String toString() {
        return "LocalManagement{" +
                "graphMap=" + graphMap +
                '}';
    }

    @Override
    public GraphMap<ILocal> getGraphMap() {
        return this.graphMap;
    }

}

