package programClass;

public class MissingElementsArray {

	public static void main(String[] args) {
		int[]a= {2,5,6,8,10};
		
		int n = a.length;
	
		for(int i=0;i<n-1;i++) {
			for(int j=a[i]+1;j<a[i+1];j++) {
				System.out.print(j+" ");
				}
		}
	}
	

}
