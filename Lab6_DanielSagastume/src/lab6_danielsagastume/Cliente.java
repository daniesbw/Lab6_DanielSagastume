package lab6_danielsagastume;

import java.util.ArrayList;

public class Cliente {
    private String username;
    private String contrasenia;
    private int ID;
    private String nom;
    private String apellido;
    private String nacionalidad;
    private String lugar;
    private String puesto;
    private float dinero;
    private ArrayList<Integer> vin=new ArrayList();

    public Cliente() {
    }
    
    
    
    public Cliente(String username, String contrasenia, int ID, String nom, String apellido, String nacionalidad, String lugar, String puesto, float dinero, ArrayList<Integer> vin) {
        this.username = username;
        this.contrasenia = contrasenia;
        this.ID = ID;
        this.nom = nom;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.lugar = lugar;
        this.puesto = puesto;
        this.dinero = dinero;
        this.vin=vin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Integer> getVin() {
        return vin;
    }

    public void setVin(ArrayList<Integer> vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return username;
    }  

}
