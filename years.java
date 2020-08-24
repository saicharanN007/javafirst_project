package javaapplication2;
import java.util.Scanner ;


public class JavaApplication2 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        float a = sc.nextInt();
        float b = 24*60*365 ;
        float c = a/b ;
        float d = c%1 ;
        int e = (int) (d*365) ;
        
        
        
        System.out.println(c + "years") ;
        System.out.println(e + "days");
        
       
        
        }
        
        
    }
    

