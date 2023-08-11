class Demo{
	public static void main(String[] arg){
		for(String x:arg){
			System.out.println(x);
		}
		System.out.println(System.identityHashCode(arg));
		System.out.println(System.identityHashCode(arg[0]));
		System.out.println(System.identityHashCode(arg[1]));
	}
}
