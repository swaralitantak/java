import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter array size: ");
		int size= Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Even elements in array: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){}
			else if(arr[i]%2==0){
				System.out.println(arr[i]);
			} else{}
		}
	}
}
