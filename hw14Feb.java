package hw_Geekster;
import java.util.Arrays;

public class hw14Feb {

	public static void main(String[] args) {
		
		int [] arr1= { 1, 2, 4, 5, 7 };
		int [] arr2= { 2,1,4,8,3};
		//int [] arr4= {1,2,3,4};
		
		int m=arr1.length;
		int n=arr2.length;
		
		System.out.println(getSecondLargest(arr2,n));
		
//		int [] arr1= {4};
//		int [] arr2= {4};
//		int qt=4;
		
		
		//System.out.println(stdHomewok(arr1,arr2,qt));
//		intercationArray(arr1,arr2,m,n);
		
//		int[]arr3=sumArray(arr4);
//		for(int i=0;i<arr3.length-1;i++) 
//	        System.out.print(arr3[i]+",");
//	        System.out.println( arr3[arr3.length-1]);

	}
	
	
//	public static int stdHomewok(int [] arr1,int[]arr2,int qt) {
//		  
//		        int n = arr1.length;
//		        int count = 0;
//		        for(int i=0;i<n;i++)
//		        	count =count+ ((arr1[i] <= qt && qt <= arr2[i]) ? 1 : 0);
//		        return count;
//		    }
//	
	
	public static int[] sumArray(int [] arr) {
		
		int[] arr2= new int[arr.length];
		arr2[0]=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
				arr2[i]=arr2[i-1]+arr[i];
		}
		
		return arr2;
	}
		
		public static void intercationArray(int [] arr1, int[] arr2,int m,int n) {
			
			int i = 0, j = 0;
		     while (i < m && j < n) {
		         if (arr1[i] < arr2[j])
		             i++;
		         else if (arr2[j] < arr1[i])
		             j++;
		         else {
		             System.out.print(arr2[j++] + " ");
		             i++;
		         }
		     }
			

    }
		
		public static int getSecondLargest(int[] a, int n){  
			int temp;  
			for (int i = 0; i < n; i++)   
			        {  
			            for (int j = i + 1; j < n; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			       return a[n-2];  
			}  
}


