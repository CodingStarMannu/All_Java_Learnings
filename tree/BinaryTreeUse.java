package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	
	
	public static BinaryTreeNode<Integer>takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		
		if(isRoot) {
		System.out.println("Enter the root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			}else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if( rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static BinaryTreeNode<Integer>takeTreeInput(){
		System.out.println("Enter the root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if( rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		
		if ( root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		
		if ( root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
		
//		if(root.left !=null) {
//			printTree(root.left);
//		}
//		if(root.right != null) {
//			printTree(root.right);
//		}
		
		
	}
	
	//Print PreOrder Binary Tree Traversal
	
	public static void printPreOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if ( root == null){
			return;
		}
		System.out.print(root.data + " ");
		printPreOrder(root.left);
		printPreOrder(root.right);

	}
	
	// Print PostOrder Binary Tree Traversal
	
	public static void printPostOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if( root == null ){
			return;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data + " ");

	}
	
	
	
	//Count Number Of Nodes in tree
	
	public static int numberOfNodes(BinaryTreeNode<Integer>root) {
		
		if(root == null ) {
			return 0;
		}
		int leftNodeCount = numberOfNodes(root.left);
		int rightNodeCount = numberOfNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	// Find Sum Of Node
	
	public static int getSum(BinaryTreeNode<Integer> root) {

		if ( root == null){
			return 0;
		}
		int sumOfLeftNode = getSum( root.left);
		int sumOfRightNode = getSum( root.right);
		return root.data + sumOfLeftNode + sumOfRightNode;
	}
	
	// Find Largest Node
	
	public static int largest(BinaryTreeNode<Integer>root) {
		
		if( root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data,Math.max(largestLeft , largestRight)); // We use Math.max to find the largest number
	}
	
	
	// Nodes greater than X
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here

		if ( root == null){
			return 0;
		}

		int ans = countNodesGreaterThanX(root.left,x) + countNodesGreaterThanX(root.right,x);

		if ( root.data > x){
			return 1+ ans;
		}else{
			return ans;
		}

	}
	

	
	//Find the Number of Leaves
	
	public static int numberOfLeaves(BinaryTreeNode<Integer>root) {
		
		if ( root == null) {// base case
			return 0;
		}
		if( root.left == null && root.right == null) { // this is not a base case
			return 1;
		}
		return numberOfLeaves(root.left) + numberOfLeaves (root.right);
	}
	
	//Print at Depth K
	
	public static void printAtDepthK(BinaryTreeNode<Integer>root, int k) {
		
		
		if ( root == null) {
			return;
		}
		if ( k == 0 ) {
			System.out.println(root.data);
		}
		printAtDepthK(root.left , k-1);
		printAtDepthK(root.right , k-1);
	}
	
	
	//Replace Node With Depth
	
	//helper
	public static void ReplaceNode(BinaryTreeNode<Integer> root, int level){
		if (root == null) {
			return;
		}
		root.data = level;

		ReplaceNode(root.left , level +1);
		ReplaceNode(root.right, level +1);


	}

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		ReplaceNode(root,0);

	}
	
	
	// Remove all leaves
	
	public static BinaryTreeNode<Integer> removeLeaves (BinaryTreeNode<Integer>root){
		
		if ( root == null) {
			return null;
		}
		if ( root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	//Mirror Binary Tree
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		
		if(root == null){
			return;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);

	// swap leftSubtree to rightSubtree
		BinaryTreeNode<Integer> temp = root.left;
		 root.left = root.right;
		 root.right = temp;

		
		return ;

	}
	
	
	// Height of Tree 
	
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if ( root == null){
			return 0;
		}
		int leftTreeHeight = height(root.left);
		int rightTreeHeight = height(root.right);
//		if( leftTreeHeight > rightTreeHeight){
//			return 1 + leftTreeHeight;
//		}else{
//			return 1 + rightTreeHeight;
//		} //or we can write
		return 1 + Math.max(leftTreeHeight, rightTreeHeight);
		
		
	}

	
	// Balanced Tree Function using height function
	
	//A Tree is balanced if the absolute difference of the height of its leftSubtree and rightSubTree will be less than equal to 1.
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if (Math.abs(leftHeight - rightHeight)> 1) {
			return false;
		}
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced( root.right);
		
		return isLeftBalanced && isRightBalanced;
	}
	
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		
		if ( root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		
		if( Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
		
	}
	
	//Diameter of Binary Tree
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here

		if (root == null){
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		int leftDiameter = diameterOfBinaryTree(root.left);
		int rightDiameter = diameterOfBinaryTree(root.right);

		return Math.max(leftHeight + rightHeight +1, Math.max(leftDiameter,rightDiameter));


	}
	
//	public static DiameterReturn diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
//		
//		if ( root == null) {
//			int height = 0;
//			int diameter = 0;
//			DiameterReturn ans = new DiameterReturn();
//			ans.height = height;
//			ans.diameter = diameter;
//			return ans;
//			}
//		DiameterReturn leftOutput = diameterOfBinaryTreeBetter(root.left);
//		DiameterReturn rightOutput = diameterOfBinaryTreeBetter(root.right);
//		
//		int diameter = 0;
//		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
//		if( leftOutput > rightOutput) {
//			leftOutput;
//		}
//		
//		
//	}
	
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		
		if( rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>>pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		
		while(!pendingChildren.isEmpty()) {
			
			BinaryTreeNode<Integer>front = pendingChildren.poll();
			System.out.println("Enter left Child of " + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			
			System.out.println("Enter right Child of " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
		
	}
	
	
	//Print level Wise
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();
            System.out.print(front.data+":");
            if (front.left!=null)
            {
                nodesToPrint.add(front.left);
                System.out.print("L:"+front.left.data);
            }
            else
            {
                System.out.print("L:-1");
            }
            
            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
            else
            {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
	}
	
	//Construct Tree Using Inorder and PreOrder
	public static BinaryTreeNode<Integer> buildTreefromPreInHelper(int pre[],int in[], int siPre, int eiPre, int siIn , int eiIn){
		
		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int rootIndex = -1;
		for( int i =siIn; i <= eiIn ; i++) {
			if ( in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}
		
		// I am assuming that root actually is present in Inorder.
		
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		
		int eiInLeft = rootIndex - 1;
		
		int siInRight = rootIndex + 1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;
		
		int leftSubTreeLength = eiInLeft - siInLeft + 1;
		
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
		int siPreRight = eiPreLeft + 1;
		
		BinaryTreeNode<Integer> left = buildTreefromPreInHelper(pre, in , siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> right = buildTreefromPreInHelper(pre, in , siPreRight, eiPreRight, siInRight, eiInRight);
		root.left = left;
		root.right = right;
		return root;
		
		
	}
	
	public static BinaryTreeNode<Integer> buildTreefromPreIn(int pre[], int in[] ){
		
		BinaryTreeNode<Integer>root = buildTreefromPreInHelper(pre, in, 0, pre.length -1 , 0 ,in.length -1);
		return root;
	}
	
	//Construct Tree Using Inorder and PostOrder
	
	
	
	
	
	
	//Create & Insert Duplicate Node
	

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if ( root == null){
			return;
		}

		BinaryTreeNode<Integer> dupRoot = new BinaryTreeNode<Integer> (root.data);

		BinaryTreeNode<Integer> rootLeft = root.left;
		root.left = dupRoot;
		dupRoot.left = rootLeft;

		insertDuplicateNode(rootLeft);
		insertDuplicateNode(root.right);

	}
	
	// Print level wise line by line
	public static void printLevelWiseLineByLine(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode<Integer>> q= new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
			
			while(true){

			int nodeCount = q.size();
            if (nodeCount == 0)
                break;
				
				while (nodeCount > 0) {
                BinaryTreeNode<Integer> front = q.peek();
                System.out.print(front.data + " ");
                q.remove();
                if (front.left != null)
                    q.add(front.left);
                if (front.right != null)
                    q.add(front.right);
                nodeCount--;
            }
            System.out.println();
		
		}

		

	}
	
	
	
	
	// Search In BST
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		
		if( root  == null){
			return false;
		}

		if (root.data == k){
			return true;
		}
		if( root.data > k) {
			return searchInBST(root.left, k);
		}
		
			return searchInBST(root.right, k);
		

	}
	
	//Elements Between K1 and K2
	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

		if ( root == null){
			return;
		}
		if( k1 < root.data){
		elementsInRangeK1K2(root.left, k1, k2);
		}
		if ( k1 <= root.data && k2 >= root.data ){

			System.out.print(root.data + " ");
		}
		elementsInRangeK1K2(root.right, k1, k2);
	}
	
	//convert BST from sorted Array
			public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){

		        return SortedArrayToBST(arr,0,arr.length-1);

				}
		   		 public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei){
		       
		        if(si>ei)
		            return null;
					int mid = (ei + si) / 2;
					BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

					root.left = SortedArrayToBST(arr, si, mid - 1);
					root.right = SortedArrayToBST(arr, mid + 1, ei);
					return root;

					
				}
		   		 
	public static boolean isBST(BinaryTreeNode<Integer>root) {
		
		if ( root == null ) {
			return true;
		}
		
		int leftMax =  maximum( root.left);
		if( leftMax >= root.data) {
			return false;
		}
		int rightMin = minimum(root.right);
		if( rightMin < root.data) {
			return false;
		}
		return false;
	}
	
	public static int minimum(BinaryTreeNode<Integer>root) {
		if ( root == null) {
			return Integer.MAX_VALUE;
			}
		int leftMin = minimum(root.left);
		int rightMin = minimum ( root.right);
		return Math.min(root.data, Math.min(leftMin, rightMin));		
		
	}
	
public static int maximum(BinaryTreeNode<Integer>root) {
		
		if( root == null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft = maximum(root.left);
		int largestRight = maximum(root.right);
		return Math.max(root.data,Math.max(largestLeft , largestRight)); // We use Math.max to find the largest number
	
	}
	

	public static IsBSTReturn isBSTBetter(BinaryTreeNode<Integer>root) {
		if(root == null) {
			IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		IsBSTReturn leftAns = isBSTBetter(root.left);
		IsBSTReturn rightAns = isBSTBetter(root.right);
		
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		boolean isBST = true;
		if( leftAns.max >= root.data) {
			isBST = false;
		}
		if(rightAns.min < root.data) {
			isBST = false;
		}
		if( !leftAns.isBST) {
			isBST = false;
		}
		if( !rightAns.isBST) {
			isBST = false;
		}
		IsBSTReturn ans = new IsBSTReturn(min, max, isBST);
		return ans;
	}
	
	// ANother simple solution to check siBST
	public static boolean isBST3(BinaryTreeNode<Integer>root , int minRange , int maxRange) {
		
		if ( root == null) {
			return true;
		}
		if ( root.data < minRange || root.data > maxRange) {
			return false;
		}
		
		boolean isLeftWithInRange = isBST3(root.left, minRange, root.data -1);
		boolean isRightWithInRange = isBST3(root.right, root.data, maxRange);
		
		return isLeftWithInRange && isRightWithInRange;
		
		
		
	}
	
	
	//Lowest common Ancestor
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		if ( root == null){
			return -1;
		}
		
		if ( root.data < a && root.data < b ){
			return getLCA(root.right, a, b);
		}

		if( root.data > a && root.data > b){
			return getLCA(root.left, a, b);
		}

		return root.data;

	}
	
	//Replace With sum of greater Nodes
	
	public static int replace(BinaryTreeNode<Integer> root, int sum) {

		if (root == null){
			return 0;
		}
		int right = replace(root.right, sum);

		int rootValue= root.data;

		root.data = root.data + right + sum;

		int left = replace( root.left , root.data);

		return rootValue + right + left;

	}

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
	
	if (root == null){
		return;
	}

	int ans = replace(root,0);
        

	}
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer>root, int x){
		if ( root == null) {
			return null;
		}
		if ( root.data == x) {
			ArrayList<Integer>output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer>leftOutput = nodeToRootPath(root.left, x);
		if (leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer>rightOutput = nodeToRootPath(root.right, x);
		if (rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
	}
	
	
	//Main

	public static void main(String[] args) {
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		
//		root.left = rootLeft;// by this we connected the nodes
//		root.right = rootRight;
//		
//
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//		
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
		
//		printTree(root);
		
//		BinaryTreeNode<Integer>root = takeTreeInput();
		
//		BinaryTreeNode<Integer>root = takeTreeInputBetter(true, 0 , true);
		
//		BinaryTreeNode<Integer>root = takeInputLevelWise();
//		printTreeDetailed(root);
//		
//		System.out.println("Num of Nodes -> "+ numberOfNodes(root));
//		System.out.println("Largest -> "+ largest(root));
//		System.out.println("Num of nodes Greater than x -> " + countNodesGreaterThanX(root, 4));
//		System.out.println("Height of tree -> " + height(root));
//		System.out.println("Number Of Leaves -> " + numberOfLeaves(root));
//		System.out.println("Print At Depth K ");
//		printAtDepthK(root , 2);
//		changeToDepthTree(root);
////		BinaryTreeNode<Integer> newRoot = removeLeaves(root);
////		printTreeDetailed(newRoot);
////		mirrorBinaryTree(root);
////		System.out.print("is Tree Balanced " + isBalanced(root));
//		System.out.println("is Tree Balanced " + isBalancedBetter(root));
		
		int in[] = {1,2,3,4,5,6,7};
		int pre[] = {4,2,1,3,6,5,7};
		BinaryTreeNode<Integer>root = buildTreefromPreIn(pre , in);
		printTreeDetailed(root);
//		System.out.println(searchInBST(root,5));
		IsBSTReturn ans = isBSTBetter(root);
		System.out.println(ans.min + " " + ans.max + " "+ ans.isBST);
		
		root = takeTreeInputBetter(true, 0 , true);
		ArrayList<Integer> path = nodeToRootPath(root,5);
		if( path == null) {
			System.out.println("Not Found");
		}else {
		for( int i : path) {
			System.out.println(i);
		}
		}
		
	}

}
