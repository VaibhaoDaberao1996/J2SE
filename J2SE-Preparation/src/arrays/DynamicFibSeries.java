package arrays;

import java.util.Arrays;

public class DynamicFibSeries {
	 public static int[] fibSeries(int size){
	        int[] series = new int[size+1];
	        
	        series[0] =0;
	        series[1] =1;
	        
	        for(int i =2;i<=size;i++){
	        	//element = last element + last second element
	            series[i] = series[i-1] + series[i-2];
	        }
	        
	        return series;
	    }
	    public static void main(String[] args) {
	      int size = 22;
	      int[] result = fibSeries(size);
	      
	      for(int i=0;i<=size;i++){
	          System.out.print(" "+result[i]);
	      }
	    }
}
