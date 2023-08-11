class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{1};
		Demo x= new Demo();
		x.fun(arr);
		int y=100;
		System.out.println(System.identityHashCode(y));
	}

	void fun(int arr[]){
		for(int x:arr){
			System.out.println(x);
		}
		int z=100;
		System.out.println(System.identityHashCode(z));
		
	}
}
