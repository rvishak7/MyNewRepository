package testNGFW;
 
import org.testng.annotations.Test;
import org.testng.SkipException;
 
public class SkipTestCase {
 
@Test
public void aSkipTest(){
String a ="Skip Test";
if(a.equals("Skip Test")){
throw new SkipException("Skipping - This is not ready for testing ");
}else{
System.out.println("I am in else condition");
}
System.out.println("I am out of the if else condition");
}
@Test
public void nonSkipTest(){
System.out.println("No need to skip this test");
}
}