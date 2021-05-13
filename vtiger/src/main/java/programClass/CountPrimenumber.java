package programClass;

public class CountPrimenumber {
	static int count=0;
	public int primeNumber(int number) {
		boolean flag=false;
		for (int i =2; i <number; i++) {
			if(number%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[]a= {11,22,33,43,44,67,};
		CountPrimenumber cpn=new CountPrimenumber();
		for (int i = 0; i < a.length; i++) {
			cpn.primeNumber(a[i]);
		}
		System.out.println(count);

	}

}
