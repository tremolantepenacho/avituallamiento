/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avituallamiento;

import java.util.Scanner;

/**
 *
 * @author hector
 */
public class Avituallamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int distancia=0;
        int distanciaTemp=0;
        int avituallamiento=-1;
        int km=0;
        int anterior=teclado.nextInt();
        while (anterior!=-1){
            int dato=teclado.nextInt();
            do {  
                km++;
                if (dato==anterior) {
                    distanciaTemp++;
                }
                else {
                        if (distanciaTemp>distancia) {
                            distancia=distanciaTemp;
                            avituallamiento=km-distancia-1;
                        }
                        anterior=dato;
                        distanciaTemp=0;



                }
                dato=teclado.nextInt();

            }
            while (dato!=-1);
            if (distanciaTemp>distancia) {
                            distancia=distanciaTemp;
                            avituallamiento=km-distancia;
                        }
            if (distancia<1){
                System.out.println("Hoy no comen");
            }
            else {
                System.out.println(avituallamiento+" "+distancia);
            }
            distancia=0;
            distanciaTemp=0;
            avituallamiento=-1;
            km=0;
            anterior=teclado.nextInt();
        }
    }
}
