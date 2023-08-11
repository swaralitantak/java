class Demo{
	public static void main(String args[]){
		int arr[]={10,20};
		int arr2[]={30,40};
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr[0]);
		System.out.println(System.identityHashCode(arr[0]));
	}
}
