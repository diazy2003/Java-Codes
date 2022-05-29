package GestionProducto;
import java.util.*;
public class GestionProducto{
    private float suma, total, precio, costo, ganancia;
    private int cantidadE, cantidadR;
    Scanner sc = new Scanner(System.in);
    public GestionProducto(){
        suma=0;
        total =0;
        precio=0;
        costo=0;
        ganancia=0;
        cantidadE=0;
        cantidadR=0;
    }
    public void setValores(float suma, int i){
        this.suma=suma;
    }
    public float ImporteVenta(){
        total=(float) (suma*(1.07));
        return total;
    }
    public float getImporteVenta(){
        return ImporteVenta();
    }
    public void Ganancias() {
        System.out.println("\n\tGanancia del Producto");
        System.out.println("Ingrese el costo del producto:");
        costo=sc.nextFloat();
        System.out.println("Ingrese el precio del producto:");
        precio=sc.nextFloat();
        ganancia=precio-costo;
        if(ganancia>=0){
            System.out.printf("\nGanancia = %.2f$", ganancia);
        }
        else{
            System.out.printf("\nGanancia = %.2f$\nAdvertencia! Ajustar el precio de venta.", ganancia);
        }
    }
    public void Mercancia() {
        int m=0;
        System.out.println("\n\tEstado de Mercancia");
        System.out.println("Ingrese la cantidad existente del producto:");
        cantidadE=sc.nextInt();
        System.out.println("Ingrese la cantidad de reorden del producto:");
        cantidadR=sc.nextInt();
        ganancia=precio-costo;
        int d=cantidadE-cantidadR;
        System.out.println("\n\tDetalles del Estado de Mercancia");
        if((cantidadE>cantidadR)&&(d>=20)){
            System.out.println("\nEstado de Solicitud: No comprar mercancia o \nno realizar compra de producto.");
            m=0;
        }
        else if((cantidadE>cantidadR)&&(d<20)){
            m=20-d;
            System.out.println("\nEstado de Solicitud: Se solicita comprar las unidades faltantes para\nllegar a las 20 unidades adicionales a la cantidad de reorden.\n");
        }
        else if(cantidadE<cantidadR){
            System.out.println("\nEstado de Solicitud: Se solicita comprar las unidades que faltan para\nllegar al punto de reorden y sumar 20.\n");
            m=20-d;
        }
        System.out.printf("Mercancia existente: \t%d",cantidadE);
        System.out.printf("\nMercancia de reorden: \t%d",cantidadR);
        System.out.printf("\nMercancia a comprar: \t%d", m);
    }
}