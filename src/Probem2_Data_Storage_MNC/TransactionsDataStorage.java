package Probem2_Data_Storage_MNC;

public class TransactionsDataStorage 
{
	
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	// function to flatten BST into right skewed tree
	static void makeRightSkewed(Node root) {
		// Base condition
		if (root == null)
			return;

		Node rightNode = root.right;
		Node leftNode = root.left;

		// make left subtree of parent skewed
		makeRightSkewed(leftNode);

		// to define new root of skewed tree
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} 
		else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		// similarly recurse for right subtree
		makeRightSkewed(rightNode);
	}
     // As instructed there is no left node
	 // Traversal towards right node of BST results ascending data transactions
	void traverseRightSkewed(Node root) {
		if (root == null)
			return;
		System.out.print(root.key + " ");
		traverseRightSkewed(root.right);
	}

	public static void main(String[] args) {
		// Hard coded input of transactions as BST:
		TransactionsDataStorage o = new TransactionsDataStorage();
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);
		// Passing root node for operation -only right nodes present
		makeRightSkewed(node);
		// Traversal of transactions in Ascending order
		o.traverseRightSkewed(headNode);
		System.out.println("\n ----Program Completed Successfully----");
	}
}
