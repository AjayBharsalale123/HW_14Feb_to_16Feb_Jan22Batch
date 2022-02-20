package hw_Geekster;

public class hw16Feb {

	public static void main(String[] args) {
		int[][]a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//evenFind(a);
		//oddFind(a);
		System.out.println(sumAntiD(a));
		
		String [][]s= {
						{"Hello","Geekster"},
						{"Good","Day"}
				
						};
		stringP(s);
	}
	
	public static void evenFind(int[][]arr){
		
		int even=0;
		System.out.print("Even Number Frequncy :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]%2==0) {
					
					System.out.print(arr[i][j]+",");
					
				}
			}
		}System.out.println();
		
		
	}
	
	
	public static void oddFind(int[][]arr){
		
		int even=0;
		System.out.print("Odd Number Frequncy :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]%2!=0) {
					System.out.print(arr[i][j]+",");
				}
			}
		}
		
		
	}
	
	public static int sumAntiD(int[][]arr){
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if((i+j)==arr.length-1) {
					sum=sum+arr[i][j];
					
				}
			}
		}
		return sum;
	}
	
	public static void stringP(String [][]arr) {
		
		int row=0;
		for(String[] val:arr) {
			System.out.println("Row"+(row++)+":"+String.join(" ",val));
		}
	}


}
