package programClass;

public class SumOfPrimeNumbers {
	static int sum=0;
	public int sumOfPrimeNumber(int number) {
		boolean flag=false;
		for (int i =2; i <number; i++) {
			if(number%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			sum=sum+number;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]a= {11,22,33,43,44,67,};
		SumOfPrimeNumbers spn=new SumOfPrimeNumbers();
		for (int i = 0; i < a.length; i++) {
			spn.sumOfPrimeNumber(a[i]);
		}
		System.out.println(sum);

	}

}
