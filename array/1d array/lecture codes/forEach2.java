class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{1,2};
		for(float x:arr){
			System.out.println(x);
			System.out.println(arr[0]);

			System.out.println(System.identityHashCode(x));
			System.out.println(System.identityHashCode(arr[0]));
		}
				
	}
}
