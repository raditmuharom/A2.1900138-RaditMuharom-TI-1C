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
public class TestXOR 
{
    public static void main( String[] args){
        
        boolean va11 = true;
        boolean va12 = false;
        System.out.println(!va11 ^ va12);
        
        va11 = false;
        va12 = true;
        System.out.println(va11 ^ va12);
        
        va11 = false;
        va12 = false;
        System.out.println(va11 ^ va12);
        
        va11 = true;
        va12 = false;
        System.out.println(va11 ^ va12);
    }
}
