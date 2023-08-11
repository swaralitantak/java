import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size: ");
		int row=sc.nextInt();
		System.out.println("column: ");
		int col=sc.nextInt();

		int arr[][]=new int[row][col];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Even elements are: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]%2==0){
					System.out.println(arr[i][j]);
				}else{
					System.out.println();
				}
			}
		}
	}
}
