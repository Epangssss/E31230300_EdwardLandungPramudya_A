/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;
/**
 *
 * @author edwar
 */
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan angka hari yang diinginkan = ");
        int a = input.nextInt();
        int i = 1;
        
        while (i <= a) {
            System.out.print(i);
            
            switch (i){
                
                case 1:
                    System.out.println("senin");
                    break;
                case 2:
                    System.out.println("selasa");
                    break;
                case 3 :
                    System.out.println("rabu");
                    break;
                case 4 : 
                    System.out.println("kamis");
                    break;
                case 5 :
                    System.out.println("jumat");
                    break;
                case 6 :
                    System.out.println("sabtu");
                    break;
                case 7 : 
                    System.out.println("minggu");
                 input.close();
                break;
               default:
                    System.out.println("eror lol ^-^");
     
                    break;
            }
         i++;
                    
                
            }
            
        }
        
        
    }
    

