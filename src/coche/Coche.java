package coche;
public class Coche{
    public static void main(String[] args) {
        Vehiculo a=new Vehiculo("Royce",300,15,20);
        Vehiculo b=new Vehiculo("Ferrory",200,30,15);
        
        a.acelerar();
        b.acelerar();
        
        a.salida();
        b.salida();
        
        a.choque(b);
        b.choque(a);
        
        a.datos();
        b.datos();
        
        a.desplazarse();
        b.desplazarse();
    }
}