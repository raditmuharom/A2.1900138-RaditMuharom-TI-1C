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
public class Grade5 

{
    public static void main( String[] args )
            
    {
        String names[] = {"Beach", "Bianca", "Lance", "Beach"};
        
        int  count = 0;
        
        
        for( int i=0; i<names.length; i++ ){
            
              if( !names[i].equals("Beah") ){
                  
                  continue;    //skip next statemenr                  
              }
              
              count++;
        }
        
        
        System.out.println("There are " + count + " Beahs in the list");
        
    }        
}