/* For a given N, return an arraylist containing the sum of even and odd integers of the first N natural numbers.

Example 1:

Input:
N = 1
Output:
0 1
Explanation:
Natural numbers less than 1 are only 1.
So the sum of even number = 0.
and the sum of odd number = 1.
Example 2:

Input:
N = 6
Output:
12 9  
Explanation:
Natural numbers less than 6 are 
1 2 3 4 5 6
So the sum of even number = 2 + 4 + 6 = 12.
and the sum of odd number = 1 + 3 + 5 = 9.

*/

class Solution {
	static ArrayList<Integer> getSum(int N) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		int even = 0, odd = 0;
		if (N == 1) {
			list.add(0);
			list.add(1);
		} else {
			for (int i = 1; i <= N; i++) {
				if (i%2 == 0) {
					even += i;
				} else {
					odd += i;
				}
			}
		}
		list.add(even);
		list.add(odd);
		return list;
	}
}
