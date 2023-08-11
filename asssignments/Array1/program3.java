import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("size: ");
		int size= Integer.parseInt(br.readLine());
		int[] arr=new int[size];
		System.out.println("enter elements: ");
		int mult=1;

		for(int i=0;i<=size-1;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0){
				mult=mult*arr[i];		
			}
		}
		System.out.println("product: "+mult);
	}
}
