
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
<<<<<<< HEAD
        this.clave = "benjamin1914";
||||||| 2b36096
        this.clave = "git";
=======
        this.clave = "benjamin";
>>>>>>> f16375ee487399abdd3214a4cbc80df0efb5c795
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
