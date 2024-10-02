package arrays;

public class EvenAndOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {12,21,33,46,35,67,88,95,1,3,5,8,66};
		
		for (int i=0; i<a.length;i++) {
			
			if(a[i]%2==0) {
				System.out.println("Even No. :"+a[i]);
			}else {
				System.out.println("Odd No. :"+a[i]);
			}
		}
	}

}
