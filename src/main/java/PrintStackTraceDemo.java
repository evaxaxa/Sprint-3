import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class PrintStackTraceDemo
{
    public static void main(String[] args) throws IOException
    {
        try
        {

            a();
        }
        catch (IOException ioe)
        {
            boolean append = true;
            FileHandler handler = new FileHandler("myFile.log", append);

            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);

            logger.severe("severe message ",);
            logger.warning("warning message");



            System.out.println("Exception occ {}"+ExceptionUtils.getStackTrace(ioe));
            //ioe.printStackTrace();
        }
    }

    static void a() throws IOException
    {
        b();
    }

    static void b() throws IOException
    {
        throw new IOException();
    }
}
// why am unable to push
// hello
//hi
// this directory is new, not initialized with git
//brb
//sure
