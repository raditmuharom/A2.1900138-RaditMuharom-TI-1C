/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outputvariabel;

/**
 *NAMA : Radit Maharom
 *KELAS : TI-1C
 *NIM : A2.1900138
 * 
 * @author Asus
 */
public class kondisiOprator
{      
       
       public static void main( String[] args ){
           
              String      status = "";
              int  grade = 80;
              
              //mendapatkan status pelajar
              status = (grade >= 60)?"Passed":"Fail";
              
              //print status
              System.out.println( status );
       }
    
}
