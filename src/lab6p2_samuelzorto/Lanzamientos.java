package lab6p2_samuelzorto;

import java.util.Date;

public class Lanzamientos {
    protected String titulo, likes;
    protected Date fecha;

    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, String likes, Date fecha) {
        this.titulo = titulo;
        this.likes = likes;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Lanzamientos{" + "titulo=" + titulo + ", likes=" + likes + ", fecha=" + fecha + '}';
    }
    
    
}
