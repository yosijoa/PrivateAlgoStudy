package gunlee.algo.math;

public class Euclidean {
	
	static int getGCD(int a, int b) {
		int bigger, smaller;
		if(a>b) {
			bigger = a; smaller = b;
		} else {
			bigger = b; smaller = a;
		}
		int remainder = smaller;
		while(remainder > 0) {
			remainder = bigger % smaller;
			bigger = smaller;
			smaller = remainder;
		}
		return bigger;
	}
	
	
	static int getLCM(int a, int b) {
		int gcd = getGCD(a, b);
		return a*b/gcd;
	}
	
	public static void main(String[] args) {
		int gcd = getGCD(21,9);
		int lcm = getLCM(21, 9);
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
