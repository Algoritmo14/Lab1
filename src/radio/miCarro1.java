/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radio;

/**
 *
 * @author Javier Bucaro
 */
public class miCarro implements Radio {
    protected boolean frecuencia,encendido;
    protected int boton;
    protected double estacionAM,estacionFM,estacion;
    protected double[][] favoritosAM,favoritosFM;
        
     public miCarro(){
        this.frecuencia = frecuencia;
        this.encendido = encendido;
        this.boton = boton;
        this.estacionAM = estacionAM;
        this.estacionFM = estacionFM;
        this.estacion = estacion;
        this.favoritosAM = favoritosAM;
    }
     
    public miCarro(boolean frecuencia,boolean encendido,int boton,double estacionAM,double estacionFM,double estacion,double[][] favoritosAM,double[][] favoritosFM){
        frecuencia = true;
        encendido = true;
        boton = 0;
        estacionAM = 0;
        estacionFM = 0;
        estacion = 0;
        favoritosAM = new double[12][2];
        favoritosFM = new double[12][2];
    }
    
    public void apagar(){
    }
    public void encender(){
    }
    public boolean getEncendido(){
        return encendido;
    }
    
    public void cambiarFrecuencia(boolean frecuencia){
        if(frecuencia==true){
            estacionAM = 530;
        }
        if(frecuencia==false){
            estacionFM = 87.9;
        }
    }
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    public double subirEstacion(){
        if(frecuencia){
            if(estacionAM>=530 && estacionAM<1610){
                estacionAM = estacionAM+10;
                if(estacionAM==1610){
                    estacionAM = 530;
                }
                estacion = estacionAM;
                return estacionAM;
            }
        } 
        if(!frecuencia){
            if(estacionFM>=87.9 && estacionFM<107.9){
                estacionFM = estacionFM+0.2;
                if(estacionFM==107.9){
                    estacionFM = 87.9;
                }
                estacion = estacionFM;
                return estacionFM;
            }
        }
        return estacion;
    }

    
    public double bajarEstacion(){
        if(frecuencia){
            if(estacionAM>530 && estacionAM<=1610){
                estacionAM = estacionAM-10;
                if(estacionAM==530){
                    estacionAM = 1610;
                }
                estacion = estacionAM;
                return estacionAM;
            }
        } 
        if(!frecuencia){
            if(estacionFM>87.9 && estacionFM<=107.9){
                estacionFM = estacionFM-0.2;
                if(estacionFM==87.9){
                    estacionFM = 107.9;
                }
                estacion = estacionFM;
                return estacionFM;
            }
        }
        return estacion;
    }
    
    public double getEstacionAM(){
        return estacionAM;
    }
    public double getEstacionFM(){
        return estacionFM;
    }
    
    public void guardar(int boton,double estacion){
        if(frecuencia){
            favoritosAM[boton-1][0] = boton;
            favoritosAM[boton-1][1] = estacion;
        }
        else{
            favoritosFM[boton-1][0] = boton;
            favoritosFM[boton-1][1] = estacion;
        }
    }
    public double sacar(int boton){
        if(frecuencia){
            estacion = favoritosAM[boton-1][1];
        }
        else{
            estacion = favoritosFM[boton-1][1];
        }
        return estacion;
    }
}
