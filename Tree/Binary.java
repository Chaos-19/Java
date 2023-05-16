package Tree;

/**
 *
 * @author GAEDC
 */
public class Binary {

    Node root;

    public Binary(int data) {
        Node n = new Node(data);
        root = n;
    }

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    void addChild(Node root, int data) {
        //Node new_node = new Node(data);
        //    Node temp = root;

       // System.out.println("Tree.Binary.addChild() : " + root.data);
        if (root.data > data) {

            if (root == null) {
                root = new Node(data);
                return;
            }
            //root = root.left;
            addChild(root.left, data);
        } else  if (root.data < data){

            if (root == null) {
                root = new Node(data);
                return;
            }
           // root = root.right;
            addChild(root.right, data);
        }
    }

    /*        while (true) {
            if (temp.data > data) {
                if (temp == null) {
                    temp.left = new_node;
                    return;
                }
                temp = temp.left;
            } else {

                if (temp.equals(null)) {
                    temp.right = new_node;
                    return;
                }

                temp = temp.right;
            }
        }*/
    void printPreOrder(Node root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

}
