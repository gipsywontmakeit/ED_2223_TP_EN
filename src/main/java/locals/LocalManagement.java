package locals;

import interfaces.IConnectors;
import interfaces.ILocalManagement;
import interfaces.Local;
import interfaces.Portal;
import lists.ArrayUnorderedList;


public class LocalManagement implements ILocalManagement {

    ArrayUnorderedList<Portal> portals;
    ArrayUnorderedList<IConnectors> connectors;

    GraphMap<Local> graphMap;

    @Override
    public void addLocal(Local local) {

        if(local instanceof Portals){
            portals.addToFront((Portal) local);
        } else if(local instanceof Connectors){
            connectors.addToFront((IConnectors) local);
        }

    }

    @Override
    public void removeLocal(Local local) {

    }

    @Override
    public void updateLocal(Local local) {

    }

    @Override
    public Local getLocal(int id) {
        return null;
    }

    private void createGraphMap(){
        graphMap = new GraphMap<>();

        for(Portal portal : portals){
            graphMap.addVertex(portal);
        }

        for(IConnectors connector : connectors){
            graphMap.addVertex(connector);
        }

        /* Idea to create routes between portals and connectors
        for(IPortals portal : portals){
            for(IConnectors connector : connectors){
                if(portal.getCoordinates().equals(connector.getCoordinates())){
                    graphMap.addEdge(portal, connector);
                }
            }
        }
         */
    }
}
