class Demo{
	public static void main(String arg[]){
		//complete intialization array: 
		int arr[][]={{},{},{}};
		System.out.println(arr.length);
		System.out.println(arr[0].length); // jvm assume the deafult of zero length since the object is already created for arr[0];

		//incomplete declation of array
		int arr1[][]= new int[3][];
		System.out.println(arr1.length);
		System.out.println(arr1[0].length); //object for arr[0] is not created that means it doesnt exist yet, therefore cant be referenced hence null-pointer;
	}
}
