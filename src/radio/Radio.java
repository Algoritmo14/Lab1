/*
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos
 * Max de Leon
 * Henry Orellana 13048
 * Javier Bucaro 13033
 * Radio.java implementara los metodos para la creacion de una radio
 */

package radio;

public interface Radio {
    
    public void apagar();
    public void encender();
    public boolean getEncendido();
    
    public void cambiarFrecuencia(boolean frecuencia);
    public boolean getFrecuencia();
    
    public double subirEstacion();
    public double bajarEstacion();
    public double getEstacionAM();
    public double getEstacionFM();
    
    public void guardar(int boton,double estacion);
    public void sacar(int boton); 
}
