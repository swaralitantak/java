import java.io.*;

class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("size: ");
		//int size= Integer.parseInt(br.readline());
		char[] arr=new char[7];

		System.out.println("elements: ");
		for(int i=0;i<7;i++){
			arr[i]=(char) br.read();
			br.skip(1);
		}
	
		System.out.println("voweels: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='0'||arr[i]=='u'){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}
