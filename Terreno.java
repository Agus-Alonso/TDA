public class Terreno {
    private int codigoTerreno;
    private double dimensionesTerreno;
    private int numeroManzana;
    
    public Terreno (int codigo, double dimensiones, int numero){
        codigoTerreno = codigo;
        dimensionesTerreno = dimensiones;
        numeroManzana = numero;
    }
    
    //Observadores
    
    public int getCodigoTerreno(){
        return codigoTerreno;
    }
    public double getDimensionesTerreno (){
        return dimensionesTerreno;
    }
    public int getNumeroManzana(){
        return numeroManzana;
    }
    
    public void setCodigoTerreno(int codigo){
        codigoTerreno = codigo;
    }
    public void setDimensionesTerreno (double dimensiones){
        dimensionesTerreno = dimensiones;
    }
    
    public void setNumeroManzana (int manzana){
        numeroManzana = manzana;
    }
    
    
    public String toString(){
        return "El Codigo del Terreno es: "+codigoTerreno+"\""
                + "La dimensiones del Terreno es: "+ dimensionesTerreno +"\"";
    }
    
    public String toStringCodigoTerreno(){
        return "El codigo del Terreno es: "+codigoTerreno+"\"La dimension del Terrono es :"+dimensionesTerreno;
    }
}
