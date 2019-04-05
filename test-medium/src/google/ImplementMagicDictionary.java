package google;

import java.util.HashSet;
/**
 * Implement a magic directory with buildDict, and search methods.

For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.

For the method search, you'll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.

Example 1:
Input: buildDict(["hello", "leetcode"]), Output: Null
Input: search("hello"), Output: False
Input: search("hhllo"), Output: True
Input: search("hell"), Output: False
Input: search("leetcoded"), Output: False
Note:
You may assume that all the inputs are consist of lowercase letters a-z.
For contest purpose, the test data is rather small by now. You could think about highly efficient algorithm after the contest.
Please remember to RESET your class variables declared in class MagicDictionary, as static/class variables are persisted across multiple test cases. Please see here for more details.

 * @title 
 * @description TODO
 * @author Cun Shi
 * @date:   Nov 14, 2018 6:48:08 PM
 */
public class ImplementMagicDictionary {

	HashSet<String> dic;

	/** Initialize your data structure here. */
	public ImplementMagicDictionary() {
		dic = new HashSet<>();
	}

	/** Build a dictionary through a list of words */
	public void buildDict(String[] dict) {
		for (String word : dict) {
			dic.add(word);
		}
	}

	/**
	 * Returns if there is any word in the trie that equals to the given word after
	 * modifying exactly one character
	 */
	public boolean search(String word) {

		char[] chs = word.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			char old = chs[i];
			for (char c = 'a'; c <= 'z'; c++) {
				if (c == old)
					continue;
				chs[i] = c;
				String target = String.valueOf(chs);
				if (dic.contains(target))
					return true;
			}
			chs[i] = old;
		}
		return false;
	}
}
