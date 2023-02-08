package interfaces;

import locals.GraphMap;

public interface ILocalManagement {

    //crud locals
    public void addLocal(ILocal local);
    public void removeLocal(ILocal local);
    public void updateLocal(ILocal oldLocal, ILocal newLocal);
    public ILocal getLocal(int id);

    public GraphMap<ILocal> getGraphMap();
    public void addEdge(ILocal local1, ILocal local2);
    public void removeEdge(ILocal local1, ILocal local2);

}
