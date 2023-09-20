package zooAnimales;

import gestion.Zona;

public class Animal {
    public static int totalAnimales = 0;
    
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public int getEdad() {
		return this.edad;
	}

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
		return this.habitat;
	}

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
		return this.genero;
	}

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return this.zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }


    public String movimiento(){
        return "desplazarse";

    }


    public static String totalPorTipo(){
        return ("Mamiferos: " + Mamifero.cantidadMamiferos()+"\nAves: "+ Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios());
    }

    
    public String toString(){
        if(this.zona == null)
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() ;
            
        return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + ", la zona en la que me ubico es" + this.getZona() + ", en el zoo" + this.zona.getZoo();
    }

}
