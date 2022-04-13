package testng;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;


public class TestClass1 
{
	@Test
	public void testMethod1()
	{
		System.out.println("test 1");
	}
	
	@DataProvider(name="test1")
	public static Object[][] dataproviderMethod1()
	{
		return new Object[][] {{1,2},{3,4},{5,6}};
	}
	
	 // This test will run 3 times 
	@Test(dataProvider ="test1")
	public void testMethod2(Integer num1,Integer num2)
	{
		System.out.println(+num1+ "  " +num2);
		 Assert.assertEquals(true, false);
		
	}
}
