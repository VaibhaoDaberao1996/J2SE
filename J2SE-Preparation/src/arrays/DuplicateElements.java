package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int a[]= {12,32,54,22,32,12,8,7,64,38,90,8,64};
		
//		for(int i =0; i<a.length; i++) {
//			boolean b =false;
//			 for(int j=i+1 ;j<a.length;j++) {
//				 
//				 if(a[i]==a[j]) {
//					 b=true;
//				 }
//			 }
//			 if(b==true) {
//				 System.out.println("Duplicate Elements "+a[i]);
//			 }
//		}
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			
			for (int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
				count=count+1;
				System.out.println(count+". "+a[i]);
				}
			}
		}
		
	
	}
}
