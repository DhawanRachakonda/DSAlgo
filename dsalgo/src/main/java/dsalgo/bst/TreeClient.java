package dsalgo.bst;

public class TreeClient {

	private static Tree tree;

	public static void main(String args[]) {

		int[] nums = new int[] { 4, 3, 6, 7, 2 };

		tree = new Tree();

		for(int i=0; i<nums.length; i++) {
			tree.addValue(nums[i]);
		}
		
		tree.printTree();
		// 2,7 are siblings
		tree.areSibling(3, 6);

	}

}
