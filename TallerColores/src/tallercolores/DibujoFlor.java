/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercolores;

public class DibujoFlor {
    
    private int longitud;
    private String tipo;
    private String color;
    
    
    public DibujoFlor(int longitud, String tipo, String color){
        this.longitud=longitud;
        this.tipo = tipo;
        this.color = color;   
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void CortarTallo(){
            System.out.println("HAS CORTADO LA FLOR");
        }
    public void CrecerMas(){
            System.out.println("LE HAS PUESTO FERTILIZANTE");
        }
    public void marchitarce(){
            System.out.println("No le has puesto agua, se murió");
        }
}   
        