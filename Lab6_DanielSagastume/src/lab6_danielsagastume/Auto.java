package lab6_danielsagastume;
public class Auto {
    private int vin;
    private String marca;
    private String modelo;
    private String carroceria;
    private int cant_pasajero;
    private float maletero;
    private String color;
    private float precio;
    private float potencia;

    public Auto() {
    }

    public Auto(int vin, String marca, String modelo, String carroceria, int cant_pasajero, float maletero, String color, float precio, float potencia) {
        this.vin = vin;
        this.marca = marca;
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.cant_pasajero = cant_pasajero;
        this.maletero = maletero;
        this.color = color;
        this.precio = precio;
        this.potencia = potencia;
    }
    
    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCant_pasajero() {
        return cant_pasajero;
    }

    public void setCant_pasajero(int cant_pasajero) {
        this.cant_pasajero = cant_pasajero;
    }

    public float getMaletero() {
        return maletero;
    }

    public void setMaletero(float maletero) {
        this.maletero = maletero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Auto{" + "vin=" + vin + ", marca=" + marca + ", modelo=" + modelo + ", carroceria=" + carroceria + ", cant_pasajero=" + cant_pasajero + ", maletero=" + maletero + ", color=" + color + ", precio=" + precio + ", potencia=" + potencia + '}';
    }

    
    
}
