class Demo{
	public static void main(String[] ars){
		int arr[]={0,-128,127,128,-129};
		int arr2[]={0,-128,127,128,-129};
		
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println("0 "+System.identityHashCode(arr[0]));
		System.out.println("-128 "+System.identityHashCode(arr[1]));
		System.out.println("127 "+System.identityHashCode(arr[2]));
		System.out.println("128 "+System.identityHashCode(arr[3]));
		System.out.println("-129 "+System.identityHashCode(arr[4]));

		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
		System.out.println(System.identityHashCode(arr2[2]));
		System.out.println(System.identityHashCode(arr2[3]));
		System.out.println(System.identityHashCode(arr2[4]));

	}
}
