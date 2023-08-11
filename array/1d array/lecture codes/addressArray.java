class Demo{
	public static void main(String[] args){
		int arr1[]=new int[2];
		arr1[0]=10;
		arr1[1]=11;

		int arr2[]=new int[2];
		//arr2[0]=20;
		arr2[0]=10;
		arr2[1]=21;

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("arr1: ");
		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println("arr2: ");
		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
	}
}
