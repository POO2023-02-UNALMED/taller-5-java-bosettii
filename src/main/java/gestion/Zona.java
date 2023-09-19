package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;
import zooAnimales.Reptil;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    public ArrayList<Animal> animales;
    
    
    public Zona(){
        if (animales == null)
            animales = new ArrayList<Animal>();
    }

    public Zona(String n,Zoologico z){
        this.nombre = n;
        this.zoo = z;
        if (animales == null)
            animales = new ArrayList<Animal>();
    }

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public Zoologico getZoo() {
        return this.zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    };

    



    public void agregarAnimales(Animal a){
        animales.add(a);
        a.setZona(this);

    }

    public int cantidadAnimales(){
        return animales.size();
    }
}
