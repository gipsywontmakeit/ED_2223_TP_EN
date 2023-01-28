package interfaces;

public interface ILocalManagement {

    //crud locals
    public void addLocal(Local local);
    public void removeLocal(Local local);
    public void updateLocal(Local local);
    public Local getLocal(int id);

}
