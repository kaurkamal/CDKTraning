import java.io.*;

/**
 * Created by kaurk on 7/31/2017.
 */
public class Readfile1 implements Runnable{

    @Override
    public void run() {



        InputStream is = null;
        //FileInputStream fis = null;
        try{
            is = new FileInputStream("C:\\training\\assignment1.txt");
            int b = is.read();
            while(b != -1){
                System.out.println((char)b);
                b = is.read();
            }


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(is != null){
                    is.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    }

