class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{1};
		System.out.println(arr);
		Demo x=new Demo();
		x.fun(arr);
	}

	void fun(int arr[]){
		System.out.println(arr);
	}

}
