package programClass;

public class Sorting {

	public static void main(String[] args) {
		int[] a= {9,3,10,1,11,2};

		int l=a.length;
		System.out.println(" before swapping");
		for(int m=0;m<l;m++) {
			System.out.print(a[m]+" ");
		}
		System.out.println();
		for(int i=0;i<l-1;i++) {
			int smallest = a[i];
			int minIndex = i;
			for(int j=i+1;j<l;j++) {
				if(a[j]<smallest) {
					smallest=a[j];
					minIndex=j;
				}
			}

			if(minIndex!=i) {
				a[i]=a[i]+a[minIndex];
				a[minIndex]=a[i]-a[minIndex];
				a[i]=a[i]-a[minIndex];
			}
		}
		System.out.println("after sorting ");
		for(int k=0;k<l;k++) {
			System.out.println(a[k]+" ");
		}
	}


}
