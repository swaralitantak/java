class Demo{
	public static void main(String[] arg){
		//intializing array using for loop
		int arr[]=new int[4];
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=count+10;
			System.out.println(arr[i]); //accessing array using for loop
		}
	}	
}
