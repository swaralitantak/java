import java.io.*;

class Demo{
	public static void  main(String[] arg)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[3];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Your array elemenents are: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
			
	}
}
