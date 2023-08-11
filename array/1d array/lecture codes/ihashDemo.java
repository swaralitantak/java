class Demo{
	public static void main(String[] args){
		int arr[]={10,1000,11,1000};

		System.out.println(System.identityHashCode(arr[3]));
		System.out.println(System.identityHashCode(arr[1]));
	}
}
