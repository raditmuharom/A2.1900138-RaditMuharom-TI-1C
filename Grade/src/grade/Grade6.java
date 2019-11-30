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
public class Grade6 
{
    
    public static void main( String[] args )
    
    {
        
        outerLoop:
              
              for( int i=0; i<5; i++ ){
                  
                    for( int j=0; j<5; i++ ){
                       
                         System.out.println("Inside for(j) loop"); //messagel
                         
                         if( j == 2 )     continue outerLoop;
              }
                    
              
              System.out.println("Inside for(i) loop"); //message2      
         
           }        
    }
}
