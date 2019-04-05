package google;

import java.util.Collections;
import java.util.HashMap;

/**
 * In a row of trees, the i-th tree produces fruit with type tree[i].

You start at any tree of your choice, then repeatedly perform the following steps:

Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.
Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?

Example 1:

Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].
Example 2:

Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].
Example 3:

Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].
Example 4:

Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.


 * @title 
 * @description TODO
 * @author Cun Shi
 * @date:   Nov 1, 2018 4:43:28 PM
 */
public class FruitIntoBasket {

	/*
	 * sliding windew
	 */
	public int totalFruit(int[] tree) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		int j = 0;
		for (int i = 0; i < tree.length; i++) {
			if(!map.containsKey(tree[i])) {
				map.put(tree[i], 1);
			}else {
				map.put(tree[i], map.get(tree[i])+1);
			}
			while(map.size() > 2) {
				map.put(tree[j], map.get(tree[j])-1);
				if(map.get(tree[j]) == 0) {
					map.remove(tree[j]);
				}
				j++;
			}
			int temp = 0;
			for (int v : map.values()) {
				temp += v;
			};
			
			max = Math.max(max, temp);
		}
		return max;
        
    }
}
