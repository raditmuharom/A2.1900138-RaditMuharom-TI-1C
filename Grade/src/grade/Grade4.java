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
public class Grade4 
{
    
    public static void mzin( String[] args )
    
    {
        
        String names[] = {"Beach", "Bianca", "Lance", "Beach"};
        
        int count = 0;
        
        
        for( int i=0; i<names.length; i++ ){
            
             
            
             if( !names[i] .equals("Beach") ){
                 
                 continue;         //skip next statement
             } 
             
             
            count++;
            
    }
        
    
    System.out.println("There are " + count + " Beahs int the list");    
    }        
}
