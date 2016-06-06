package coche;

public class Vehiculo{
   public String nombre;
   public int velocidad,aceleracion,peso, km=0, espacio=0;
    
    public Vehiculo(String n,int v,int a,int p){
    nombre=n;
    velocidad=v;
    aceleracion=a;
    peso=p;
    }
    
    public void acelerar(){
        km+=aceleracion;
        if(km>velocidad) km=velocidad;
    }
    
    public void salida(){
    km-=peso;
    if(km<0) km=0;
    }
    
    public void choque(Vehiculo e){
    if(peso>=e.peso) System.out.println("¡Estas echando a "+e.nombre+"!");
    }
    
    public void datos(){
    System.out.println("Velocidad: "+km+"/"+velocidad);
    System.out.println("Aceleración: "+aceleracion);
    System.out.println("Peso: "+peso);
    
    System.out.println("Ya ha rcorrido "+espacio+" metros.");
    }
    
    public void desplazarse(){espacio+=km;}
}