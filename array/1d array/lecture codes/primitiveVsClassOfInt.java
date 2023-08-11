class Demo{
	public static void main(String[] args){
		int arr[]={10,20};
		Integer arr2[]={10,20};
		System.out.println(arr.toString());

		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr2));
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr2[0]));
	}
}
