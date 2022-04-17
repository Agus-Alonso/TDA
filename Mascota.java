public class Mascota {
    private int codigo;
    private String nombre;
    private double peso;
    private int edad;
    
    public Mascota (int cod, String nn, double pe, int ed){
        codigo = cod;
        nombre = nn;
        peso = pe;
        edad = ed;
    }
    //Observadores
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPeso(){
        return peso;
    }
    public int getEdad(){
        return edad;
    }
    //--------------------------------------------------------------------------
    
    //Metodo toSting
    public String toStringNombre(){
        return "El Nombre de la mascota es: "+nombre;
    }
    
    public String toString(){
        return "Codigo: "+codigo+", "+" Nombre: "+nombre+" Peso: "+peso+" Edad: "+edad;
    }
    //--------------------------------------------------------------------------
    //Modificadores
    public void setCodigo(int cod){
        codigo = cod;
    }
    public void setNombre(String nn){
        nombre = nn;
    }
    public void setPeso(double pe){
        peso = pe;
    }
    public void setEdad(int ed){
        edad = ed;
    }
    
    public void setAumentarPeso(int pe){
        peso = peso + 1;
    }
    //--------------------------------------------------------------------------
    //Propias del Tipo
    
}
