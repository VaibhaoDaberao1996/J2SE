package arrays;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 4, 5, 6, 4, 1, 8, 9, 5, 2, 9, 8, 8, 8};

		for(int i=0; i<a.length;i++) {
			
			int count =0;
			for(int j=i+1; j<a.length;j++) {
				
				if (a[i]==a[j]) {
					count++;
					break;
				}
				
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}
	}
}
	
		

		    

		        
