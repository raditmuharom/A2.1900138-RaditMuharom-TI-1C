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
public class AritmatikaDemo 
{
    public static void main(String[] args)
   {
       
       //sedikit angka
       int i = 37;
       int j = 42;
       double x = 27.475;
       double y = 7.22;
       System.out.println("Variable values...");
       System.out.println("    i = " + i);
       System.out.println("    j = " + j);
       System.out.println("    x = " + x);
       System.out.println("    y = " + y);
       
       //penjumlah angka
       System.out.println("Adding...");
       System.out.println("     i + j = " + (i + j ));
       System.out.println("     x + y = " + (x + y ));
       
       //pengurangan angka
       System.out.println("Subtracting...");
       System.out.println("    i - j = " + (i - j));
       System.out.println("    x - y = " + (x - y));
       
       //perkalian angka
       System.out.println("Multiplying...");
       System.out.println("    i * j = " + (i * j));
       System.out.println("    x * y = " + (x * y));
       
       //pembagian angka
       System.out.println("Dividing...");
       System.out.println("    i / j = " + (i / j));
       
       //mdnghitung hasil modulus dari pembagian
       System.out.println("Computing the remainder...");
       System.out.println("    i % j = " + (i % j));
       System.out.println("    x % y = " + (x % y));
       
       //tipe penggabungan
       System.out.println("Mixing tipes...");
       System.out.println("    j + y = " + (j + y));
       System.out.println("    i + y = " + (x + y));
   }
}
