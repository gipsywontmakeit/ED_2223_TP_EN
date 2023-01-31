package players;

import lists.ArrayUnorderedList;

public class PlayerInteractionsTree {
    private static class Node {

        int data;
        private Node left;
        private Node right;
        private ArrayUnorderedList<PlayerInteraction> interactions;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.interactions = new ArrayUnorderedList<>();
        }
    }

    Node root;

    public void addInteraction(PlayerInteraction playerInteraction) {
        if(root == null) {
            root = new Node(playerInteraction.getConnectorID());
        }
        addInteraction(root, playerInteraction);
    }

    public void addInteraction(Node node, PlayerInteraction interaction) {
        if(node.data == interaction.getConnectorID()) {
            node.interactions.addToRear(interaction);
        } else if(node.data > interaction.getConnectorID()) {
            if(node.left == null) {
                node.left = new Node(interaction.getConnectorID());
            }
            addInteraction(node.left, interaction);
        } else {
            if(node.right == null) {
                node.right = new Node(interaction.getConnectorID());
            }
            addInteraction(node.right, interaction);
        }
    }

    public ArrayUnorderedList<PlayerInteraction> getLatestInteractions(int connectorID) {
        Node node = findNode(root, connectorID);
        if(node == null) {
            return new ArrayUnorderedList<>();
        }
        return node.interactions;
    }

    private Node findNode(Node node, int connectorID) {
        if(node == null) {
            return null;
        }
        if(node.data == connectorID) {
            return node;
        } else if(node.data > connectorID) {
            return findNode(node.left, connectorID);
        } else {
            return findNode(node.right, connectorID);
        }
    }
}
