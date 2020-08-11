
package Tienda;


public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }
    
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.año = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return año;
    }

    public void setAnio(int anio) {
        this.año = año;
    }
    
    
    
}
