package arrays;

public class Test1 {

   public static void main(String[] args) {
	
	   int[] a = {1,24,65,68,46,3,5,90,87,6,47,3,5,1,2,8,9,9,8,15};
	   
//	   for(int i=0; i<a.length;i++) {
//		   if(a[i]%2==0) {
//			  
//			   System.out.println("Its a even Number "+a[i]);
//			  
//		   }else {
//			   System.out.println("Its a odd number "+a[i]);
//		   }
//	
	//   }
	   

	   for(int i=0; i<a.length; i++) {
		   
		   boolean b=false;
		   for(int j=2; j<a[i]; j++) {
			   if(a[i]%j==0) {
				  b=true; 
			   }
		   }
		   if(b==false) {
			   System.out.println("Is a prime no. "+a[i]);
		   }
	   }
}
}
