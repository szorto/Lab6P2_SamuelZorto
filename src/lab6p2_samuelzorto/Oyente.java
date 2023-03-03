package lab6p2_samuelzorto;

import java.util.ArrayList;

public class Oyente extends Usuario{
    private String nombre;
    private ArrayList<Canciones> listaC = new ArrayList();
    private ArrayList<Canciones> listaA = new ArrayList();

    public Oyente() {
    }

    public Oyente(String username, String contra, int anio) {
        super(username, contra, anio);
        
    }

    

    public ArrayList<Canciones> getListaC() {
        return listaC;
    }

    public void setListaC(ArrayList<Canciones> listaC) {
        this.listaC = listaC;
    }

    public ArrayList<Canciones> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Canciones> listaA) {
        this.listaA = listaA;
    }

    @Override
    public String toString() {
        return "Oyente{" + "nombre=" + nombre + ", listaC=" + listaC + ", listaA=" + listaA + '}';
    }
    
    
}
