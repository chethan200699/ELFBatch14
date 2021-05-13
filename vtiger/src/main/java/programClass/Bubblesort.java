package programClass;

public class Bubblesort {

	public static void main(String[] args) {
		int[]a= {10,24,45,12,7};
		int l=a.length;
		System.out.println("before Swapping");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<l-1;i++) {
			for (int j = 0; j <l-i-1; j++) {
				if(a[j]>a[j+1]) {
					 a[j]+=a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		System.out.println("after swapping");
		for(int k=0;k<l;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
