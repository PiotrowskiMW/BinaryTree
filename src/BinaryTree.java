
public class BinaryTree {
	public BinaryTree()
	{
		root = null;
	}
	class Node
	{
		Node left,right;
		Integer value;
		public Node(int value)
		{
			this.value= value;
			left = null;
			right= null;
		}
	}
	Node newNode(int value)
	{
		Node tmp = new Node(value);
		if(root == null) root = tmp;
		return tmp;
	}
	Node root;
	Node findValue(Node tree, int value)
	{
		if (tree==null) return null;
		else if (value == tree.value) return tree;
		else if (value < tree.value) return(findValue(tree.left, value));
		else return(findValue(tree.right, value));
	}
	int treeSize(Node tree)
	{
		if (tree==null) return 0;
		else return(1 + treeSize(tree.left) + treeSize(tree.right));
	}
	int treeMaxHeight(Node tree)
	{
		int left, right;
		if (tree==null) {
			return 0;
		} else {
			left = treeMaxHeight(tree.left);
			right = treeMaxHeight(tree.right);
			return(1 + (left > right ? left : right));
		}
	}
	void eraseTree() 
	{
		root = null;
	    /*if (node == null) return;
	 
	    // first delete both subtrees
	    eraseTree(node.left);
	    eraseTree(node.right);
	   
	    // then delete the node 
	    node=null;*/
	} 
	Node insert(Node node, int value) {
		  //If the tree is empty, return a new, single node
		  if (node == null) {
		    return(newNode(value));
		  }
		  else {
		    //Otherwise, recur down the tree
		    if (value <= node.value) node.left = insert(node.left, value);
		    else node.right = insert(node.right, value);

		    return(node); // return the (unchanged) node pointer
		  }
		} 
}
