package programClass;

public class Reversingarray {

	public static void main(String[] args) {
      int[]a= {10,20,30,40,50,60};
      int l=((a.length)/2);
      for(int i=0;i<l;i++) {
    	  a[i]=a[i]+a[a.length-1-i];
    	  a[a.length-1-i]=a[i]-a[a.length-1-i];
    	  a[i]=a[i]-a[a.length-1-i];
      }
      for(int i=0;i<a.length;i++) {
    	  System.out.print(a[i]+" ");
      }

	}

}
