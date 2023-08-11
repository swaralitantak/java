import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size: ");
		int size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter elements: ");
		int mult=1;
		for(int i=0;i<=size-1;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				mult=mult*arr[i];
			}
		}
		System.out.println("product: "+mult);
	}
}
