public class Receta {
    private String nombreIngrediente;
    private int cantidadRequerida;
    
    public Receta (String nombre, int cantidad){
        nombreIngrediente = nombre;
        cantidadRequerida = cantidad;
    }
    
    public String getNombreIngrediente (){
        return nombreIngrediente;
        
    }
    
    public int getCantidadIngrediente (){
        return cantidadRequerida;
    }

    
    public void setNombreIngrediente (String nombre){
        nombreIngrediente = nombre;
    }
    
    public void setCantidadIngrediente (int cantidad){
       cantidadRequerida = cantidad;
    }
    
   @Override
    public String toString(){
        return nombreIngrediente+": "+cantidadRequerida;
    }
    
    
}
