import java.util.Scanner;

/**
 *
 * @author agust
 */
public class testMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner (System.in);
        Mascota mascota;
        
        mascota = cargarMascota();
        
        do{ 
            System.out.println("----------------------------------------------");
            System.out.println("1. Mostrar el Nombre de la Mascota");
            System.out.println("2. Aumentar edad de la Mascota en 1");
            System.out.println("3. Cambiar el peso de la Mascota ");
            System.out.println("4. Mostrar todos los datos de la Mascota");
            System.out.println("5. Salir");
            System.out.println("----------------------------------------------");
            opcion = entrada.nextInt();
            menu(opcion, mascota);
        }while(opcion != 5);
        
    }
    
    public static Mascota cargarMascota (){
        Mascota mascota;
        int cod;
        String nn;
        double pe;
        int ed;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el codigo de la Mascota");
        cod = entrada.nextInt();
        System.out.println("Ingrese el nombre de la Mascota");
        nn = entrada.next();
        System.out.println("Ingrese el peso de la Mascota");
        pe = entrada.nextDouble();
        System.out.println("Ingrese la edad de la Mascota");
        ed = entrada.nextInt();
        
        mascota = new Mascota (cod, nn, pe, ed);
        return mascota;
    }
    
    public static void menu (int opcion, Mascota mascota){
        
        switch (opcion){
            case 1: System.out.println(mascota.toStringNombre());
            break;
            case 2: aumentarEdadMascota(mascota);
            break;
            case 3: cambiarPesoMascota(mascota);
            break;
            case 4: System.out.println(mascota.toString());
            break;
            
        }
    }
    
    public static void aumentarEdadMascota(Mascota mascota){
        int nuevaEdad;
        nuevaEdad = mascota.getEdad() +1 ;
        mascota.setEdad(nuevaEdad);
    }
 
    public static void cambiarPesoMascota(Mascota mascota){
        Scanner entrada = new Scanner (System.in);
        double nuevoPeso;
        System.out.println("Ingrese el nuevo peso de la mascota");
        nuevoPeso = entrada.nextDouble();
        
        mascota.setPeso(nuevoPeso);
    }
}
