package GestionProducto;
import java.util.*;
public class Main{
        public static void main(String[] args) throws Exception {
        final float ITBMS=(float) 0.07;
        int opcion, i;
        float suma, precio, impuesto;
        //Se crea un objeto y llama a los métodos.
        GestionProducto op = new GestionProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t<<Programa de Gestión de Productos>>");
        System.out.println("Nota: A continuación debe digitar el número en el menú que\ncorresponde a la opción que desea realizar.");
        do{
            System.out.println("\nMenú de opciones:");
            System.out.println("    1.Importe de la venta.\n    2.Ganancia del producto.\n    3.Estado de Mercancia.\n    4.Salir.");
            System.out.print("Opción eleguida:");
            opcion=sc.nextInt();
            System.out.println("\n***************************************************");
            switch (opcion){
                case 1:
                    System.out.println("\n\tImporte de la Venta");                    
                    System.out.println("Nota: Escriba 0 para terminar de introducir precios.");
                    System.out.println("Escriba el precio de los productos.\n");
                    i=1;
                    suma=0;
                    do{
                        System.out.printf("Precio #%d:\t", i);
                        precio=sc.nextFloat();
                        suma=suma+precio;
                        i++;
                    }while(precio!=0);
                    System.out.println("____________________________________");
                    System.out.printf("Subtotal     = %.2f\n", suma);
                    impuesto = suma*ITBMS;
                    System.out.printf("ITBMS        = %.2f (7%%)\n", impuesto);
                    op.setValores(suma, i);
                    op.ImporteVenta();
                    System.out.println("____________________________________");
                    System.out.printf("Total        = $%.2f", op.getImporteVenta());
                    break;
                case 2:
                    op.Ganancias();
                    break;
                case 3:
                    op.Mercancia();
                    break;
                case 4:
                    System.out.println("\n\t\tFIN DEL PROGRAMA");
                    break;
                default:
                    break;
            }
            System.out.println("\n\n***************************************************");
        }while (opcion!=4);
        sc.close();
    }
}