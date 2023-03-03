package lab6p2_samuelzorto;

import java.util.ArrayList;
import java.util.Date;

public class Albums extends Lanzamientos{
    private ArrayList<Canciones> can = new ArrayList();
    private int cantidad;
              
//    Los álbumes cuentan con una lista de
//canciones pertenecientes al mismo y la cantidad de canciones con la que cuenta.        

    public Albums() {
        super();
    }

    public Albums(int cantidad, String titulo, String likes, Date fecha) {
        super(titulo, likes, fecha);
        this.cantidad = cantidad;
    }

    public ArrayList<Canciones> getCan() {
        return can;
    }

    public void setCan(ArrayList<Canciones> can) {
        this.can = can;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Albums{" + "can=" + can + ", cantidad=" + cantidad + '}';
    }
    
    
}
