
package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {



    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       double sp, ai, qa, tl, ga;
       
       
        System.out.print("Stage Presence: ");
        sp = input.nextDouble();
        System.out.print("Audience Impact: "); 
        ai = input.nextDouble();
        System.out.print("Q&A: ");
        qa = input.nextDouble();
        System.out.print("Talent: ");
        tl = input.nextDouble();
        ga = sp + ai + qa + tl;
        
        System.out.print("Average: " +ga);
     
        
        
                
        
        
    }
    
}
