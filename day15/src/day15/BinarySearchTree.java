package day15;

public class BinarySearchTree {
	public static void main(String[] args) {	
		BST bst = new BST();
		Node node = null;	
			node = bst.insert(node, 56);
			node = bst.insert(node, 30);
			node = bst.insert(node, 70);
			bst.printNodes(node);
		}
}

class BST {  //Insert node
	public Node insert(Node node, int val) {						
		if (node == null) {
			return createNewNode(val);
			}
		// value is less than node is insert on left
		if (val < node.data) { 										
			node.left = insert(node.left, val);
			} 
		// value is greater than node is insert on right
		else if ((val > node.data)) { 								
			node.right = insert(node.right, val);
			}
		return node;
		}	
	//Create new node
	public Node createNewNode(int k) {								
		Node a = new Node();
			a.data = k;
			a.left = null;
			a.right = null;
		return a;
		}
	//print data
	public void printNodes(Node node) {								
		if (node == null) {
			return;
			}
		System.out.println(node.data + " ");
			printNodes(node.left);
			printNodes(node.right);
		}	
}
