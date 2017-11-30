/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class Divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ingreso = new Scanner(System.in);
    int num, i, divisor = 0, iterar = 0, aux = 0;
   
    System.out.println("DIVISORES");
    System.out.print("Ingresa un numero: ");
    num = ingreso.nextInt();
   
    if(num % 2 == 0){
      iterar = num / 2;
    }
    else{
      iterar = (num - 1) / 2;
    }
    for(i = 1; i <= iterar; i++){
      if(num % i == 0){
        aux = num / i;
        if(aux != divisor){
          divisor = aux;
        }
        if(i == iterar){
          System.out.println(divisor);
        }
        else{
          System.out.print(divisor + ",");
        }
      }
    }
    }
    
}
