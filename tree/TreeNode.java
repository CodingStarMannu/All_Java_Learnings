package tree;

import java.util.ArrayList;

public class TreeNode<T> {
	
	T data;
	ArrayList<TreeNode<Integer>> children;
	
	
	public TreeNode(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	}

}
