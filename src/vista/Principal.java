/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import logica.OperacionesNumericas;

/**
 *
 * @author Vinni
 */
public class Principal {
    public static void main(String[] args) {
        
        OperacionesNumericas oper = new OperacionesNumericas();
        
        System.out.println("MI PROGRAMA");
        System.out.println("1. Decimal a Binario");
        System.out.println("2. Binario a Octal");
        System.out.print ("Digite opcion -> ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        long numero; 
        if (opcion == 1){
            System.out.print("Digite un numero decimal -> ");
            numero = sc.nextLong();
            String rta = oper.convertirDecBinario(numero);
            System.out.println("Numero binario es: "+rta);
            
        }
        if (opcion == 2){
            System.out.print("Digite un numero binario -> ");
            String numeroBin = sc.next();
            String rta = oper.convertirBinarioOctal(numeroBin);
            System.out.println("Numero Octal es: "+rta);
            
        }
        
        
    }
    
}
