
package Model;
public class Conexion {

private String driver;
private String url;
private String usuario;
private String clave;

    public Conexion() {
        this.driver =  "org.postgresql.Driver" ;
        this.url = "jdbc:postgresql://localhost:5432/prueba_delivery";
        this.usuario = "postgres";
        this.clave = "morales1993";

    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
