package interfaces;

public interface ILocalManagement {

    //crud locals
    public void addLocal(ILocals local);
    public void removeLocal(ILocals local);
    public void updateLocal(ILocals local);
    public ILocals getLocal(int id);

}
