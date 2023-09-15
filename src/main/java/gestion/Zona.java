package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    public Zoologico zoo;
    public static ArrayList<Animal> animales;
    
    
    public Zona(){
    }

    public Zona(String n,Zoologico z){
        this.nombre = n;
        this.zoo = z;
    }

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



    public void agregarAnimales(Animal a){
        animales.add(a);
    }

    public int cantidadAnimales(){
        return animales.size();
    }
}
