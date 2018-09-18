package uniqueBinarySearchTrees;
/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?

	Example:
	
	Input: 3
	Output: 5
	Explanation:
	Given n = 3, there are a total of 5 unique BST's:
	
	   1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3
 * @title 
 * @description TODO
 * @author Cun Shi
 * @date:   Aug 31, 2018 7:53:04 AM
 */
public class UniqueBinarySearchTrees {
	/*
	 * ����binary tree����������ÿһ��������root������������1��root��һ��7�����־���F(1,7),������������0�����֣�G(0)
	 * ����������6�����֣�G(6),�õ�F(1,7)=G(0)*G(6)����ô7�����ֵ�binary tree����������F(1,7)+...+F(7,7).
	 */
	public int numTrees(int n) {
	    int [] G = new int[n+1];
	    G[0] = G[1] = 1;
	    
	    //G(n) = G(0) * G(n-1) + G(1) * G(n-2) + �� + G(n-1) * G(0) 
	    for(int i=2; i<=n; ++i) {
	    	for(int j=1; j<=i; ++j) {
	    		G[i] += G[j-1] * G[i-j];
	    	}
	    }
	    return G[n];
	}
}