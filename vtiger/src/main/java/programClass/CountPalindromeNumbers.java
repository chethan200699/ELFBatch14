package programClass;

public class CountPalindromeNumbers {
	static int count=0;
	public int Palindrome(int number) {
		int copy=number;
		int reversenumber=0;
		while(number!=0) {
			int rem=number%10;
			reversenumber=reversenumber*10+rem;
			number=number/10;
		}
		if(copy==reversenumber) {
			count=count+1;
		}
		return count;
	}

	public static void main(String[] args) {
		int[]a= {11,22,33,43,44,67,};
		CountPalindromeNumbers cpn=new CountPalindromeNumbers();
		for (int i = 0; i < a.length; i++) {
			cpn.Palindrome(a[i]);
		}
		System.out.println(count);

	}

}
