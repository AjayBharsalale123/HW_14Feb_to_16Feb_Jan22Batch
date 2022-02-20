package hw_Geekster;

public class hw15Feb {

	public static void main(String[] args) {
		
		
		
		int [][] array=
						{ 
							{1, 2 ,  3  , 4 , 5}, 
						 {16 , 17 , 18  ,19  ,6}, 
						 {15 , 24 , 25  ,20 , 7}, 
						 {14 , 23 , 22  ,21 , 8}, 
						 {13 , 12 , 11  ,10 , 9 }
						  };
		
		int [] [] arr= {
							{1,1,0,1,1},
							{1,1,1,1,1},
							{1,1,1,0,1},
							{1,1,1,1,1},
							{0,1,1,1,1}
				
						};
		replaceElements(arr);
		
//		int a[][] = {       
//                {1, 2, 3},    
//                {4, 5, 6},    
//                {7, 8, 9}    
//            };    
//      
//  
//		int b[][] = {       
//                {1, 2, 3},    
//                {4, 5, 6},    
//                {0, 8, 9}    
//		};   
//      
//		addMatrix(a,b);
	}
	
	public static void addMatrix(int [][]arr1,int [][]arr2){
		
		int m=arr1.length;
		int m1=arr1[0].length;
		int n=arr2.length;
		int [][]result=new int[m][m1];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(result[i][j]+" ");
			}System.out.println();
		}
		
		
		
	}
	
//	public static int[] spiralOrder(int[][]arr) {
//		
//	}
	
	public static void changeRowColumn(int[][] mat, int M, int N, int x, int y)
    {
        for (int j = 0; j < N; j++)
        {
            if (mat[x][j] != 0) {
                mat[x][j] = -1;
            }
        }
 
        for (int i = 0; i < M; i++)
        {
            if (mat[i][y] != 0) {
                mat[i][y] = -1;
            }
        }
    }
	
	public static void replaceElements(int[][]arr) {
		
		if (arr == null || arr.length == 0) {
            return;
        }
 
       
        int M = arr.length;
        int N = arr[0].length;
 
        
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (arr[i][j] == 0)           
                {
                    
                    changeRowColumn(arr, M, N, i, j);
                }
            }
        }
 
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (arr[i][j] == -1) {
                	arr[i][j] = 0;
                }System.out.print(arr[i][j]+" ");
            }System.out.println();
			
        }
    }
}
