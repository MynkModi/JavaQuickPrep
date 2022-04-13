package corejava;


public class VariableArgumentsDemo {
	
	public static void main(String[] args) {
		VariableArgumentsDemo objVarArgDemo=new VariableArgumentsDemo();
		objVarArgDemo.varArgDemo("One", "Two", "Three", "Four");
	}
	
	
	private void varArgDemo(String...str) {
		for (String s:str) {
			System.out.println(s+"\n");
		}
		
		System.out.println("first argument is: "+str[0]+"\n");
	}
}
