/**
 * 
 */
package N1014;

import java.util.Scanner;

/**
 * @author michael
 * Description: 
 *
 *
 * 2017年5月3日
 */
public class Trie {
	Trie[] next = new Trie[26];
	int count;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String string;
		String mstring;
		Trie tree = new Trie();
		for (int i = 0; i < n; i++) {
			string = scanner.next();
			create(tree,string);
		}
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			mstring = scanner.next();
			System.out.println(searchTree(tree,mstring));
		}
	}
	public static int searchTree(Trie tree,String mstring){
		Trie p = tree;
		int co = 0;
		for (int i = 0; i < mstring.length(); i++) {
			char ch = mstring.charAt(i);
			if(p.next[ch-'a']!=null){
				p = p.next[ch-'a'];
			}
			else{
				return 0;
			}
		}
		return p.count;
	}
	
	public static void create(Trie tree,String string){
		Trie p = tree;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(p.next[ch-'a']!=null){
				p = p.next[ch-'a'];
				p.count++;
			}
			else{
				Trie trie = new Trie();
				//p.next[]是用来存储子节点的，例如a->a,a->b,a->c,则对应的树是a下面有三个子节点
				p.next[ch-'a'] = trie;
				p = trie;
				p.count = 1;
			}
		}
		
	}
}
