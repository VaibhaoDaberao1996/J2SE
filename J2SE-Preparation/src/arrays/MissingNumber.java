package arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int a[]= {4,1,5,3};
//		int b[]= {1,2,3,6,4,7,9,8,5};
		
		for (int i=1; i<=5; i++) {
			
			boolean f= false;
			for(int j=0; j<a.length;j++) {
				
				if(a[j]==i) {
					
					f=true;
				}
			}
		if(f==false) {
			
			System.out.println(i);
		}
		}
	}
}
