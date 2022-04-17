public class testTerreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        Terreno arrTerreno[] = new Terreno [verificarLongitud()];
       
        cargarArrTerreno(arrTerreno);
        
        do{
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("1.  Encontrar el Terreno mas grande");
            System.out.println("2.  Dado un codigo de Terreno encontrar sus dimensiones");
            System.out.println("3.  Dado una manzana mostrar los datos de cada uno de los Terreno que se encuentra en ellas");
            System.out.println("4.  Mostrar el precio de cada uno de los Terrenos");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Ingrese la opcion que desea realizar");
            opcion = entrada.nextInt();
            menu(arrTerreno, opcion);
        }while (opcion != 5);
        
    }
    
    public static int verificarLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        do{
            System.out.println("Ingrese la cantidad de Terrenos que desea almacenar: ");
            longitud = entrada.nextInt();
            if (longitud<=0){
                System.out.println("ERROR: La longitud debe ser mayor a 0");
            }
        }while (longitud<=0);
        return longitud;
    }
    
    public static Terreno cargarTerreno (){
        Terreno terreno;
        int codigo;
        int numero;
        double dimensiones;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el codigo del Terreno");
        codigo = entrada.nextInt();
        System.out.println("Ingrese las dimensiones del Terreno");
        dimensiones = entrada.nextDouble();
        System.out.println("Ingrese el numero de la manzana donde se encuentra el terreno");
        numero = entrada.nextInt();
        
        terreno = new Terreno (codigo, dimensiones, numero);
        return terreno;
    }
    
    public static void cargarArrTerreno(Terreno arrTerreno[]){
        int inicio;
        for (inicio=0; inicio < arrTerreno.length;  inicio++){
            arrTerreno[inicio]= cargarTerreno();
        }
    }
    
    public static void menu (Terreno arrTerreno [ ], int opcion){
        Scanner entrada = new Scanner (System.in);
        switch(opcion){
            case 1:
                
                break;
            //----------------------------------------------------------------------------------------------------------------------------------------------    
            case 2:
                int codigoAuxiliar;
                int posicionEncontrada;
                System.out.println("Ingrese el codigo del Terreno que desea buscar");
                codigoAuxiliar = entrada.nextInt();
                posicionEncontrada =buscarCodigoTerreno (arrTerreno, codigoAuxiliar);
                if (posicionEncontrada!=-1){
                    System.out.println(arrTerreno[posicionEncontrada].toStringCodigoTerreno());
                  
                    
                } else{
                    System.out.println("El codigo de Terreno ingresado no pertenece a ninjun Terreno guardado");
                } 
                break;
            //----------------------------------------------------------------------------------------------------------------------------------------------    
            case 3:
                int numeroManzanaAux;
                System.out.println("Ingreso el el numero de la Manzada del Terreno");
                numeroManzanaAux = entrada.nextInt();
                if(verificarManzanaTerreno(arrTerreno, numeroManzanaAux));
                   buscarTerrenoPorManzana(arrTerreno,numeroManzanaAux );
                break;
            //----------------------------------------------------------------------------------------------------------------------------------------------
            case 4:
                break;
        }
    }
    
    //----------------------------------------------------------------------------------------------------- 
    //Estos 2 Modulos Sirven para 2.  Dado un codigo de Terreno encontrar sus dimensiones
    public static int buscarCodigoTerreno(Terreno arrTerreno[], int codigoAuxiliar){
        boolean codigoExiste = false;
        int posicion = -1;
        int inicio = 0;
         while(!codigoExiste && inicio<arrTerreno.length){
            if(arrTerreno[inicio].getCodigoTerreno()== codigoAuxiliar){
                codigoExiste = true;
                posicion = inicio;
            } else{
                inicio++;
            }
        }
         return posicion;
    }
    public static double buscarDimensionesCodigo(Terreno arrTerreno [], int codigoAuxiliar){
        int inicio = 0;
        boolean codigoAuxiliarEncontrado = false; 
         while(!codigoAuxiliarEncontrado){
            if(arrTerreno[inicio].getCodigoTerreno() == codigoAuxiliar){
                codigoAuxiliarEncontrado=true;
            } else{
                inicio++;
            }
        }
        return arrTerreno[inicio].getDimensionesTerreno();
    }
    //-----------------------------------------------------------------------------------------------------
    public static boolean verificarManzanaTerreno(Terreno arrTerreno[ ], int numeroManzanaAux){
        boolean codigoVerificado = false;
        int inicio = 0;
        while (!codigoVerificado && inicio < arrTerreno.length){
            if(arrTerreno[inicio].getNumeroManzana()== numeroManzanaAux){
                codigoVerificado = true;
            }else
                inicio++;
        }
        return codigoVerificado;
    }
    public static void buscarTerrenoPorManzana(Terreno arrTerreno[],int numeroManzanaAux ){
        int inicio;
        for (inicio=0; inicio <arrTerreno.length ; inicio++){
            if (arrTerreno[inicio].getNumeroManzana()== numeroManzanaAux){
                System.out.println("En la Manzana" +arrTerreno[inicio].getNumeroManzana());
                System.out.println(arrTerreno[inicio].toString());
            }
        }  
    } 
    //-----------------------------------------------------------------------------------------------------
    
    //-----------------------------------------------------------------------------------------------------
    
    
}
