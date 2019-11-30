/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

/**
 *NAMA : Radit Maharom
 *KELAS : TI-1C
 *NIM : A2.1900138
 *
 * @author Asus
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        try{
 System.out.println( args[1] );
 }catch( ArrayIndexOutOfBoundsException exp ){
 System.out.println("Exception caught!");
 } } }


