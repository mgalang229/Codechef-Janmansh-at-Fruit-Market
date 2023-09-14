import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
			int ans = Math.min(Integer.MAX_VALUE, compute(x, a, b));
			ans = Math.min(ans, compute(x, b, c));
			ans = Math.min(ans, compute(x, a, c));
			System.out.println(ans);
		}
		fs.close();
	}
	
	static int compute(int x, int y, int z) {
		int res = 0;
		if (y < z) {
			res = (x - 1) * y;
			res += z;
		} else {
			res = (x - 1) * z;
			res += y;
		}
		return res;
	}
}
