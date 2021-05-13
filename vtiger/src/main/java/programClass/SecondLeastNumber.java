package programClass;

public class SecondLeastNumber {

	public static void main(String[] args) {
          int[]a= {12,23,34,45,56,67,78};
       int firstleast=1000,secondleast=100;
       for (int i = 0; i < a.length; i++) {
		if(a[i]<firstleast) {
			secondleast=firstleast;
			firstleast=a[i];
			
		}else if (a[i]<secondleast) {
			secondleast=a[i];
		}
	}
       System.out.println("second least number is "+secondleast);
	}
	
}
