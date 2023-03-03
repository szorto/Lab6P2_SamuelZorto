package lab6p2_samuelzorto;

public class Usuario {
    protected String username, contra;
    protected int anio;

    public Usuario() {
    }

    public Usuario(String username, String contra, int anio) {
        this.username = username;
        this.contra = contra;
        this.anio = anio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contra=" + contra + ", anio=" + anio + '}';
    }
    
    
}
