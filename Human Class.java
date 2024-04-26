/**
 *
 *@author Jackline Bonifas
 */
import java.util.*;
public class Classification {
    
        
    
public class Human
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Male mo = new Male();
        Female fo = new Female();
        System.out.print("choose between male and female :\n "
        + "1 : Male\n"
        + " 2 : Female\n");
        int num;
        num= sc.nextInt();
        
        switch(num){
            case 1:
                mo.display();
                break;
            case 2:
                fo.display();
                break;
        }
            
        // TODO code application logic here
    }
    
}
