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
        int connectorID = interaction.getConnectorID();

        if(node.data == connectorID) {
            node.interactions.addToRear(interaction);
        } else if(node.data > connectorID) {
            if(node.left == null) {
                node.left = new Node(connectorID);
            }
            addInteraction(node.left, interaction);
        } else {
            if(node.right == null) {
                node.right = new Node(connectorID);
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

    @Override
    public String toString() {
        return "PlayerInteractionsTree{" +
                "root=" + root +
                '}';
    }
}
