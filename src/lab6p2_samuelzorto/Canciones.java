package lab6p2_samuelzorto;

public class Canciones {
    private String titulo, duracion, album;

    public Canciones() {
    }

    public Canciones(String titulo, String duracion, String album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", duracion=" + duracion + ", album=" + album + '}';
    }
    
    
    
}
