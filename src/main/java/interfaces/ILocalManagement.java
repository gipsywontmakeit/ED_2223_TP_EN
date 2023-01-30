package interfaces;

import locals.GraphMap;

public interface ILocalManagement {

    //crud locals
    public void addLocal(Local local);
    public void removeLocal(Local local);
    public void updateLocal(Local oldLocal, Local newLocal);
    public Local getLocal(int id);

    public GraphMap<Local> getGraphMap();
    public void addEdge(Local local1, Local local2);
    public void removeEdge(Local local1, Local local2);

}
