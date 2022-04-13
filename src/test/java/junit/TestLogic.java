package junit;

import junit.Logic;
import log4j.Log4jDemo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TestLogic {
	
	static Logger log=Logger.getLogger(TestLogic.class.getName());
	
@BeforeClass  
public static void setUpBeforeClass() throws Exception {  
    System.out.println("before class"); 
    log.info("Im starting");	
 
}  
@Before  
public void setUp() throws Exception {  
    System.out.println("before");  
}  

@Ignore 
public void testFindMax(){  
    System.out.println("test case find max");  
    assertEquals(4,Logic.findMax(new int[]{1,3,4,2}));  
    assertEquals(-2,Logic.findMax(new int[]{-12,-3,-4,-2}));  
}  
@Test  
public void testCube(){  
    System.out.println("test case cube");  
    assertEquals(27,Logic.cube(3));  
}  
@Ignore  
public void testReverseWord(){  
    System.out.println("test case reverse word");  
    assertEquals("ym eman si nahk",Logic.reverseWord("my name is khan"));  
} 

@Test
public void testarrList(){
	System.out.println("arraylist check");  
	List<String> actual= Arrays.asList("four", "fives", "six");
	assertEquals(actual,Logic.arrList(1));	 
}

@Test
public void throwException() throws Exception{
	System.out.println("exception check");  
	try{
		int actualNum=-9;
		int expectedNum=Logic.throwException(actualNum);
		assertEquals(actualNum,expectedNum);
	}
	catch(Exception e){
		assertEquals("Amount is invalid-s",e.getMessage());
	}
}

@After  
public void tearDown() throws Exception {  
    System.out.println("after");  
}  

@AfterClass  
public static void tearDownAfterClass() throws Exception {  
    System.out.println("after class");  
}  
}