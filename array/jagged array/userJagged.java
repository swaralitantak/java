import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("row: ");
		int row= Integer.parseInt(br.readLine());
		System.out.println("columns: ");
		int col= Integer.parseInt(br.readLine());

		int arr[][]=new int[row][col];

		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
	}
}
