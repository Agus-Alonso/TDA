public class testReceta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcion;
        Receta arrReceta [] = new Receta [verficarCantidad()];
        cargarArrReceta(arrReceta);
        
        do{
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Listar los ingredientes con la cantidad requerida");
            System.out.println("2. Verificar si cierto ingrediente es necesario en la receta");
            System.out.println("3. SALIR");
            System.out.println("------------------------------------------------------------");
            System.out.println("Ingrese el numero de lo que deseea hacer:");
            opcion = entrada.nextInt();
            menu (arrReceta, opcion);
        }while (opcion != 3);
        
    }
    
    
    public static int verficarCantidad (){
        int cantidad;
        Scanner entrada = new Scanner (System.in);
        do{
        System.out.println("Ingrese la cantidad de ingredientes");
        cantidad = entrada.nextInt();
        if (cantidad <= 0){
            System.out.println("ERROR la cantidad de Ingredientes tiene que ser mayor a 0");
        }
        }while (cantidad <=0);
        
        return cantidad;
    }
    
    public static Receta cargarRecetas (){
        Scanner entrada = new Scanner (System.in);
        String nombre;
        int cantidad;
        Receta receta;
        System.out.println("Ingrese el nombre del Ingrediente");
        nombre = entrada.next();
        System.out.println("Ingrese la cantidad de gramos del ingrediente "+nombre+" :");
        cantidad = entrada.nextInt();
        receta =  new Receta (nombre, cantidad);
        return receta;
    }
    
    public static void cargarArrReceta (Receta arrReceta [ ]){
        int inicio;
        
        for (inicio = 0; inicio < arrReceta.length ; inicio++) {
            arrReceta [inicio] = cargarRecetas();
        }
    }
    
    public static void menu (Receta arrReceta [], int opcion){
        switch(opcion){
            case 1:
                int longitud = arrReceta.length;
                for (int inicio =0; inicio < longitud; inicio ++){
                    System.out.println(arrReceta[inicio].toString());
                }
            break;
            
            case 2:
                boolean palabra;
                palabra = verificarPalabra(arrReceta);
                if (palabra == true){
                    System.out.println("La El ingrediente es necesario en la receta");
                } else{
                    System.out.println("El ingrediente nos es necesario en la receta");
                }
        }
    }
        
    public static boolean verificarPalabra (Receta arrReceta[]){
        Scanner entrada = new Scanner (System.in);
        int inicio=0;
        boolean palabraVerificada = false;
        String ingredienteVerificar;
        System.out.println("Ingrese el Ingrediente a Verificar");
        ingredienteVerificar = entrada.next();
        while (inicio < arrReceta.length && !palabraVerificada ){
            if (arrReceta [inicio].getNombreIngrediente() == ingredienteVerificar ){
                palabraVerificada = true;
            }
            inicio++;
        }
        return palabraVerificada;
    }
    
}
