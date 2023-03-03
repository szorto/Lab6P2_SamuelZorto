package lab6p2_samuelzorto;

import java.util.ArrayList;

public class Artistas extends Usuario{
    private ArrayList<Canciones> listaF = new ArrayList();
    private ArrayList<Canciones> listaPlaylist = new ArrayList();

    public Artistas() {
        super();
    }

    public Artistas(String username, String contra, int anio) {
        super(username, contra, anio);
    }

    public ArrayList<Canciones> getListaF() {
        return listaF;
    }

    public void setListaF(ArrayList<Canciones> listaF) {
        this.listaF = listaF;
    }

    public ArrayList<Canciones> getListaPlaylist() {
        return listaPlaylist;
    }

    public void setListaPlaylist(ArrayList<Canciones> listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
    }

    @Override
    public String toString() {
        return "Artistas{" + "listaF=" + listaF + ", listaPlaylist=" + listaPlaylist + '}';
    }
    
    
}
