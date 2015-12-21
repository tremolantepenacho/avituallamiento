/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avituallamiento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector
 */
public class Avituallamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            String entrada = br.readLine();
            while (entrada.compareTo("-1")!=0){
                String puntos[]=entrada.split(" ");
                int km[]=new int[puntos.length];
                for (int i=0;i<puntos.length;i++){
                    km[i]=Integer.parseInt(puntos[i]);
                }

                int avituallamiento=-1;
                int distancia=0;
                int i=0;
                while ((i<km.length-1) && (km.length-1-i>distancia)){
                    int j=i+1;
                    while (km[i]==km[j]){
                        j++;
                    }
                    if (distancia<(j-i-1)){
                        distancia=j-i-1;
                        avituallamiento=i;
                    }
                    i=j;
                }
                if (avituallamiento==-1) System.out.println("HOY NO COMEN");
                else System.out.println(avituallamiento+" "+distancia);
                entrada = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Error");
        }
        
    }
    
}
