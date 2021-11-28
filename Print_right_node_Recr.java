package geekster;

public class Print_right_node_Recr {
	static int  levelSoFar=0;
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		rightnode(root,0);
	}
	
	public static void rightnode(Node root,int currentLevel) {
		
		if(root == null)
			return;
		if(currentLevel>=levelSoFar) {
			System.out.println(root.key);
			levelSoFar++;
		}
		
		rightnode(root.right, currentLevel+1);
		rightnode(root.left, currentLevel+1);
		
	}

}
