package lab6p2_samuelzorto;

import java.util.Date;

public class Singles extends Lanzamientos{
    private Canciones c;
    
    public Singles() {
        super();
    }

    public Singles(Canciones c, String titulo, String likes, Date fecha) {
        super(titulo, likes, fecha);
        this.c = c;
    }

    public Canciones getC() {
        return c;
    }

    public void setC(Canciones c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Singles{" + "c=" + c + '}';
    }
    
    
}
