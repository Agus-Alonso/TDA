package Ejercicio9;

/**
 *
 * @author agust
 */
public class Socios {
    private int codigoSocio;
    private String nombreSocio;
    private String apellidoSocio;
    private int edadSocio;
    private int torneosGanados;
    private int mayorPuntaje;
    
    public Socios (int codigo, String nombre, String apellido, int edad, int torneos, int puntaje ){
        codigoSocio = codigo;
        nombreSocio = nombre;
        apellidoSocio = apellido;
        edadSocio = edad;
        torneosGanados = torneos;
        mayorPuntaje = puntaje;
    }
    //Observadores
    public int getCodigoSocio(){
        return codigoSocio;
    }
    public String getNombreSocio(){
        return  nombreSocio;
    }
    public String getApellidoSocio(){
        return apellidoSocio;
    }
    public int getEdadSocio(){
        return edadSocio;
    }
    public int getTorneosGanados(){
        return torneosGanados;
    }
    public int getMayorPuntaje(){
        return mayorPuntaje;
    }
    
    
    //Modificadores
    public void setCodigoSocio(int codigo){
        codigoSocio = codigo;
    }
    public void setNombreSocio(String nombre){
        nombreSocio = nombre;
    }
    public void setApellidoSocio (String apellido){
        apellidoSocio = apellido;
    }
    public void setEdadSocio(int edad){
         edadSocio = edad;
    }
    public void setTorneosGanados(int torneos){
         torneosGanados = torneos;
    }
    public void setMayorPuntaje(int puntaje){
        mayorPuntaje = puntaje;
    }
    
    @Override
    public String toString(){
        return "El mayor puntaje obtenido fue: "+mayorPuntaje +"\"El socio fue: "+nombreSocio;
    }
    
    
    //Propiades del Tipo 
    public boolean equals (Socios socio2){
        return codigoSocio==socio2.getCodigoSocio();
    }
    
}
