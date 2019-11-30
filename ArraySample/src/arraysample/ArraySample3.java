/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysample;

/**
 *NAMA : Radit Maharom
 *KELAS : TI-1C
 *NIM : A2.1900138
 * 
 * @author Asus
 */
public class ArraySample3 {
    
    public static void main( String[] args ){
        
        
//         Elemen 512 x 128 dari integer array
           
           int[][] twoD = new int[512][128];
           

//         karakter array 8 x 16 = 24
           
           char[][][] threeD = new char[8][15][24];
           
           
//         String array 4 baris x 2 kolom
           
           String[][] dogs = {{ "terry", "brown" },
                     
               { "Kristin", "white" },
               
               { "toby", "gray"},
               { "fido", "black"}
               };
           System.out.print( dogs[0][0] );
    } }