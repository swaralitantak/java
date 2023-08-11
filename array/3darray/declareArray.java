class Demo{
	public static void main(String[] args){
		int [][][] arr={{{10,20,30},{40,50},{60}},{{70,80},{90,100,110}}};
		for(int [][]x:arr){
			for(int[] y:x){
				for(int z:y){
					System.out.print(z+" ");
				}System.out.println();
			}
		}
	}
}
