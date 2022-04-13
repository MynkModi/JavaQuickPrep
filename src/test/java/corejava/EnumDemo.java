package corejava;

/*An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
Note that they should be in uppercase letters:*/

public class EnumDemo {
	static enum BrowserType{
		EDGE,CHROME,FIREFOX,IE; };
		
	//private static BrowserType myBrowser;
		
	private static String getDetailsOfBrowser(BrowserType myBrowser) {
			  switch (myBrowser){ 
				  case EDGE:
					  return "This is edge browser";
				  case CHROME: 
					  return "This is chrome browser";
				  case FIREFOX: 
					  return "This is firefox browser"; 
				  case IE: 
					  return"This is ie browser"; 
				  default: 
					  return "No browser was selected"; 
			   }		  	
		  }
			
	
		
	
	public static void main(String[] args) {
		for (BrowserType currentBrowser:BrowserType.values()) {
			System.out.println(currentBrowser);	
		}
		
		BrowserType myBrowser=BrowserType.EDGE;
		System.out.println(getDetailsOfBrowser(myBrowser));
		
	}
	
	 
}//end class
