package corejava;

public class SingletonExample {
	
	private static SingletonExample singltnInstance= new SingletonExample();
	
	//declaring private constructor so that its object/instance cant be created
	private SingletonExample() {
		//empty constructor
	};
	
	public static SingletonExample getInstance() {
		return singltnInstance;	
	}

}


//********************************//

class SingletonUsage{
	public static void main(String[] args) {
		//SingletonExample obj= new SingletonExample(); // compiler error
		SingletonExample obj=SingletonExample.getInstance();
	}
}
