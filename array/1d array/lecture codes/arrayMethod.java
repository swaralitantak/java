class Demo{
	public static void main(String[] args){
		Demo x= new Demo();
		int returnValue= x.fun(10);
		System.out.println(returnValue);
	}

	int fun(int x){
		x=x+10;
		return x;
	}
}
