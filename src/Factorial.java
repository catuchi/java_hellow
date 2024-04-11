
public class Factorial {
	
	int num;
	
	public long factorial(int n) {
		if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial a = new Factorial();
		System.out.println(a.factorial(5));
	}

}
