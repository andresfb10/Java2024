/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercolores;
public class TallerColores {
    public static void main(String[] args) {
        
         DibujoFlor flower = new DibujoFlor(12,"Rosa","Rojo");
         System.out.println("Flower color: " + flower.getColor());
        
         EscudoFutbol escudo = new EscudoFutbol("Rojo","Azul","Barcelona","España");
            System.out.println("Color Principal: " + escudo.getColorPrimario());
            
            System.out.println("");
          
          flower.CortarTallo();
          
                      System.out.println("");
          
          escudo.cantarHimno();

    }
}
