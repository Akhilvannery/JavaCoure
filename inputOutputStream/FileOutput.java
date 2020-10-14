package inputOutputStream;
import java.io.*;

public class FileOutput
{
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("/home/bizessence/JavaProg/Source1.txt");
        FileInputStream fis2=new FileInputStream("/home/bizessence/JavaProg/Source2.txt");
        
        FileOutputStream fos=new FileOutputStream("/home/bizessence/JavaProg/Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}
