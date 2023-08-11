import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Array Size: ");
		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("count of even and odd elements");
		int countEven=0;
	      	int countOdd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){}
			else if(arr[i]%2==0){
				countEven=countEven+1;
			} else{
				countOdd=countOdd+1;
			}
		}
		System.out.println("Even: "+countEven);
		System.out.println("Odd: "+countOdd);
	}
}
