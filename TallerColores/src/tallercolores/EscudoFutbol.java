/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercolores;

public class EscudoFutbol {
    
    private String colorPrimario;
    private String colorSecundario;
    private String teamName;
    private String conuntryTeam;

    public EscudoFutbol(String colorPrimario, String colorSecundario, String teamName, String conuntryTeam) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.teamName = teamName;
        this.conuntryTeam = conuntryTeam;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getConuntryTeam() {
        return conuntryTeam;
    }

    public void setConuntryTeam(String conuntryTeam) {
        this.conuntryTeam = conuntryTeam;
    }
    
    public void ganarPartidos(){
        System.out.println("GANAMOS EL PARTIDO");
    }
    public void perderPartidos(){
            System.out.println("PERDIMOS EL PARTIDO");
        }
    public void cantarHimno(){
        System.out.println("Cesó la horrible noche\n" +
                "La libertad sublime\n" +
                "Derrama las auroras\n" +
                "De su invencible luz.\n" +
                "La humanidad entera\n" +
                "Que entre cadenas gime,\n" +
                "Comprende las palabras\n" +
                "Del que murió en la cruz.");
    }
    
}