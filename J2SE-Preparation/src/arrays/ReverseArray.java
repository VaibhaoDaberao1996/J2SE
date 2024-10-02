package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {45,65,32,34,89,32,13,2,77,42,57,89,23,97};

		/*
		 * for(int i=a.length-1; i>=0; i--) { System.out.print(" "+a[i]); }
		 */
		int event_count=0;
		int odd_count =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				event_count++;
			}else {
				odd_count++;
			}
		}
		
		System.out.println("even :"+event_count);
		System.out.println("Odd :"+odd_count);
		
		int[] even = new int[event_count];
		int[] odd = new int[odd_count];
		
		int even_index_pos=0;
		int odd_index_pos=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[even_index_pos]=a[i];
				even_index_pos++;
			}else {
				odd[odd_index_pos]=a[i];
				odd_index_pos++;
			}
		}
		
		for(int i=0;i<even.length;i++) {
			
			System.out.print(even[i]+" ");
		}
		
		System.out.println();
	
		for(int i=0;i<odd.length;i++) {
			
			System.out.print(odd[i]+" ");
		}
	}

}
