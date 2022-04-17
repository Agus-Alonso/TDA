import java.util.Scanner;

public class testSocios {

    public static void main(String[] args) {
        boolean socioBoolean;
        Scanner entrada = new Scanner (System.in);
        int []arrPuntaje  = new int [1];
        String []arrNombre = new String [1];
        int opcion;
       Socios socio;
       Socios socio2;
        System.out.println("A continuacion cargas al primer Socio");
       socio  = cargarSocio();
        System.out.println("A continuacion cargas al segundo Socio");
       socio2 = cargarSocio();
       
       socioBoolean = socio.equals(socio2);
       if (socioBoolean){
           System.out.println("ERROR, Socio con mismo codigo");
       }
       while (!socioBoolean){
       do{
           System.out.println("--------------------------------------------------------------");
           System.out.println("1.   Buscar quien de los 2 socios a ganado mas torneo");
           System.out.println("2.   Buscar el mayor puntaje obtenido y el socio que lo obtuvo");
           System.out.println("FIN PROGRAMA");
           System.out.println("--------------------------------------------------------------");
           System.out.println("Ingrese la opcion a realizar");
           opcion = entrada.nextInt();
           menu (socio, socio2, opcion);
       }while (opcion !=3);
       }
    }
    
    public static void menu (Socios socio, Socios socio2, int opcion){
        switch(opcion){
            case 1: mostrarSociosMasTorneosGanados(socio, socio2);
                break;
            case 2: 
                    if (buscarMayorPuntaje(socio, socio2)==1){
                    
                break;
        }
        
    }
    }
    
    public static Socios cargarSocio (){
        Scanner entrada = new Scanner (System.in);
        int codigo, torneos, puntaje, edad;
        String nombre, apellido;
        
        Socios socio;
       
        System.out.println("Ingrese el codigo del Socio");
        codigo = entrada.nextInt();
        System.out.println("Ingrese el nombre");
        nombre = entrada.next();
        System.out.println("Ingre el apellido");
        apellido = entrada.next();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese la cantidad de torneos ganados");
        torneos = entrada.nextInt();
        System.out.println("Ingrese el mayor puntaje obtenido");
        puntaje = entrada.nextInt();
        
        socio = new Socios (codigo, nombre, apellido,edad, torneos, puntaje);
        return socio;
    }

    public static void mostrarSociosMasTorneosGanados(Socios socio, Socios socio2){
        //String SocioMasTorneos;
        
        if(socio.getTorneosGanados()>socio2.getTorneosGanados()){
            System.out.println("El socio con mas torneos ganados es: "+socio.getNombreSocio());
        }else{
            System.out.println("El socio con mas torneos ganados es: "+socio2.getNombreSocio());
        }
    }
    
    public static int buscarMayorPuntaje (Socios socio,Socios socio2){
        
        int numeroSocio;
        if (socio.getMayorPuntaje()>socio2.getMayorPuntaje()){
            numeroSocio = 1;
        }else{
            numeroSocio = 2;
        }
    return numeroSocio;    
    }
    
}
