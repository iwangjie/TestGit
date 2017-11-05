import com.testgit.kit.PropertiesUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
//        String s = Arrays.toString(new int[]{1, 2, 3});
//        System.out.println(s);
//test
//        System.out.println("Six Six Six!My first open source github app!");

       // String test = PropertiesUtil.getPro("", "test");
       // System.out.println(test);
        //PropertiesUtil.checkProprietsTime("test");

        Scanner sc = new Scanner(System.in);
        while (true){
            String pname =  sc.next();
            String test = new PropertiesUtil().getPro(pname, "test");
            System.out.println(test);
        }

    }


    
}
