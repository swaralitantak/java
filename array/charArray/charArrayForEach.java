class Demo{

	public static void main(String[] args){
		char ch[]={'a','b','c'};
		String str[]={"hello","world","hehe"};
		int arr[]={1,2,3,};
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
			System.out.println(str[i]);
			System.out.println(arr[i]);
		}

		System.out.println("for int");
		for(int x:arr){
			System.out.println(x);
		}
		System.out.println("for ch");
		for(char y:ch){
			System.out.println(y);
		}
		System.out.println("for str");
		for(String z:str){
			System.out.println(z);
		}
	}
}
