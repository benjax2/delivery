
package Dao;


public class Comuna {
    
private int idComuna;
private String nombreComuna;

    public Comuna() {
    }

    public Comuna(int idComuna, String nombreComuna) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }



}
