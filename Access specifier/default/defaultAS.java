//when no AS specified its, default. SAME FOLDER

class defaultAcess{
	int x=10;
}

class Demo{
	public static void main(String[] args){
		defaultAcess obj= new defaultAcess();
		System.out.println(obj.x);
	}
}
