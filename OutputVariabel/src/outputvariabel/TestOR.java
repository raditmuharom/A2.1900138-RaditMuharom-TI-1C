/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outputvariabel;

/**
 **NAMA : Radit Maharom
 *KELAS : TI-1C
 *NIM : A2.1900138
 * 
 * @author Asus
 */
public class TestOR 
{
    
     public static void main(String[] args ){
             int    i     = 0;
             int    j     = 10;
             boolean test = false;
             
             //demonstrasi ||
             test = (i < 10) || (j++ > 9);
             System.out.println(i);
             System.out.println(j);
             System.out.println(test);
             
             //demonstrasi |
              test = (i < 10) || (j++ > 9);
             System.out.println(i);
             System.out.println(j);
             System.out.println(test);
     }
}
