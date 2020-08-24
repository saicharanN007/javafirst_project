package swithcase;
import java.util.Scanner ; 


public class Swithcase {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Choose one of the following \n 1\thi\n 2\they\n 3\thello\n");
        Scanner sc = new Scanner (System.in) ;
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
                System.out.println("you have chosen the first option");
                break ;
               
            case 2 :
                System.out.println("you have chosen second option ");
                break;
            case 3 :
                System.out.println("you have chosen third option");
                break;
            default :
                System.out.println("please give one of the following options only");
                
        } 
        
    }
    
}
