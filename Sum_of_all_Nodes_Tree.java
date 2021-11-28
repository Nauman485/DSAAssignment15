package geekster;

public class Sum_of_all_Nodes_Tree {
	static int sum=0;
	static int sum(Node root) {
		if(root==null)
			return -1;
		sum=sum+root.key;
		sum(root.left);
		sum(root.right);
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left= new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println(sum(root));
	}


}
