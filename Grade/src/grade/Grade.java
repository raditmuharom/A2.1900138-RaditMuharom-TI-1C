/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

/**
 *NAMA : Radit Maharom
 *KELAS : TI-1C
 *NIM : A2.1900138
 * 
 * @author Asus
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        // TODO code application logic here
    
    {
    
       double grade = 92.0;
       
       
       if( grade >= 90 ){
           
           System.out.println( "Excellent!" );
      
       }
       
       else if( (grade < 90) && (grade >= 80)){
              System.out.println("Goood job!" );
              
       }
       
       else{
             System.out.println("Sorry, you failed.");
       }
       
    }
}
