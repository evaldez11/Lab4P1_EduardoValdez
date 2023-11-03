/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Lab4P1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int opcion = 0;
       
       while (opcion !=4){
           System.out.println("******Menu******\n1. Inversion Especial\n2. Balanza de Cadenas\n3. Cifrado de Mensajes\nIngrese una opcion: ");
           opcion = leer.nextInt();
           
           switch(opcion){
               case 1:
                   String cad;
                   System.out.println("Ingrese una cadena: ");
                   leer.nextLine();
                   cad = leer.nextLine();
                   String cadinv = "", acum= "";
                    if (cad.length()>=5){
                        for (int i = cad.length()-1;i>=0;i--){
                            cadinv += cad.charAt(i);
                            if (cad.charAt(i) == ' '||i==0){
                                if (i==0){
                                    acum =cadinv+acum;
                                }else{
                                    acum = " "+cadinv+acum;
                                }
                                cadinv ="";
                            }
                        }
                        System.out.println("Cadena Invertida: "+acum);
                    }else{
                        System.out.println("La cadena tiene que ser mayor a 5");
                    }
                  
                   break;
                   
               case 2:
                   int acum1=0, acum2=0, acum3=0;
                   String cad1;
                   System.out.println("Ingrese cadena 1: ");
                   leer.nextLine();
                   cad1 = leer.nextLine();
                   
                   for(int i=0;i<cad1.length();i++){
                       char cant1 = cad1.charAt(i);
                       acum1 += cant1; 
                   }
                   String cad2;
                   System.out.println("Ingrese cadena 2: ");
                   cad2 = leer.nextLine();
                   
                   for(int j=0;j<cad2.length();j++){
                       char cant2 = cad2.charAt(j);
                       acum2 += cant2; 
                   }
                   
                   String cad3;
                   System.out.println("Ingrese cadena 3: ");
                   cad3 = leer.nextLine();
                   
                   for(int k=0;k<cad3.length();k++){
                       char cant3 = cad3.charAt(k);
                       acum3 += cant3; 
                   }
                   System.out.println("Peso cadena 1: "+acum1);
                   System.out.println("Peso Cadena 2: "+acum2);
                   System.out.println("Peso Cadena 3: "+acum3);
                   
                   if(acum1>acum2 && acum1>acum3){
                       System.out.println("La cadena 1 es la mas pesada");
                   }else if (acum2>acum1 && acum2>acum3){
                       System.out.println("La cadena 2 es la mas pesada");
                   }else if(acum3>acum1 && acum3>acum2){
                       System.out.println("La cadena 3 es la mas pesada");
                   }
                   break;
                   
               case 3:
                   String mensaje;
                   System.out.println("Ingrese el mensaje a decifrar: ");
                   leer.nextLine();
                   mensaje = leer.nextLine();
                   System.out.println("Mensaje decifrado: ");
                   
                   for (int i = 0; i<mensaje.length();i++){
                       int acumulador = 0;
                       char letra = mensaje.charAt(i);
                       acumulador +=letra+2;
                       
                       char mensaje2 = (char) acumulador;
                       System.out.print(mensaje2);
                   }
                   System.out.println("");
                   break;
               case 4:
                   System.out.println("Saliendo del programa");
                   break;
               default:
                   System.out.println("Opcion no valida");
                   break;
               
           }//Fin switch
           
       }//fin while
    }//fin 
    
}
