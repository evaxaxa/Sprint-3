// class representing custom exception
import org.apache.commons.lang3.exception.ExceptionUtils;
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception  
        super(str);
    }
}

// class that uses custom exception InvalidAgeException  
public class TestCustomException1
{
//please diconnect FT
    //WILL DO FT WITH DEEPS
    //perfet
    // method to check the age  
    static void validate (int age) throws InvalidAgeException{

        if(age < 18){

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    // main method  
    public static void main(String args[])
    {
        try
        {
            // calling the method   
            validate(13);
        }
        catch (InvalidAgeException ex)
        {
            //System.out.println("Caught the exception" +ex);
           // ex.printStackTrace();
          System.out.println(ExceptionUtils.getStackTrace(ex));
            // printing the message from InvalidAgeException object  
            //System.out.println("Exception occured: " + ex);
        }
///take control
        //Take control and use what u want!!!

       // System.out.println("rest of the code...");
    }
}  