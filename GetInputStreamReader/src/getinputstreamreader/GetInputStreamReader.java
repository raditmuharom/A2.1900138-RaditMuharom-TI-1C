/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package getinputstreamreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *NAMA : Radit Muharom
 *KELAS : TI-1C
 *NIM : A2.1900138
 *
 * @author Asus
 */
public class GetInputStreamReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(
 System.in) ); 
        String name = "";

 System.out.print("Please Enter Your Name:");


 try{
 name = dataIn.readLine();
 }catch( IOException e ){
 System.out.println("Error!");
 }
 System.out.println("Hello " + name +"!");
 }
} 
  
