package programClass;

public class LargestNumber {

	public static void main(String[] args) {
      int[]a= {12,23,11,45,67};
      int largest = 0;
      for (int i = 0; i < a.length; i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
	}
      System.out.println("the largest number in the array is "+largest);
	}
}
