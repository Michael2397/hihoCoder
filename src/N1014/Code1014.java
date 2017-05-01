/**
 * 
 */
package N1014;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author michael
 * Description: 
 * 超时了！！！
 *
 * 2017年4月27日
 */
public class Code1014 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> listkey = new ArrayList<>();
		ArrayList<Integer> sum = new ArrayList<>();
		
		int n = scanner.nextInt();
	
		
		while (scanner.hasNext()) {
			for (int i = 0; i < n; i++) {

				list.add(scanner.next());
			}
			break;
		}
		
	/*	for (int i = 0; i < list.size(); i++) {
			System.out.println("打印n"+list.get(i));
		}
*/
		int m = scanner.nextInt();
	
		while (scanner.hasNext()) {
			for (int i = 0; i < m; i++) {

				listkey.add(scanner.next());
			}
			break;
		}
		
	/*	for (int i = 0; i < listkey.size(); i++) {
			System.out.println("打印m"+listkey.get(i));
		}*/

		for (int i = 0; i < listkey.size(); i++) {
			int count = 0;
			String str = listkey.get(i);
			for (int j = 0; j < list.size(); j++) {
				String string = list.get(j);
				if(string.indexOf(str)==0){
					count++;
				}
			}
			sum.add(count);
		}
		for (int i = 0; i < sum.size(); i++) {
			System.out.println(sum.get(i));
		}
	}
}
