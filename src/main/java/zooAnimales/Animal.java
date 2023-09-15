package zooAnimales;

import gestion.Zona;

public class Animal {
    public static int totalAnimales = 0;
    
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    public Zona zona;


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









    

    public String movimiento(){
        return "desplazarse";

    }
    public void totalPorTipo(){   
        Mamifero a1 = new Mamifero();     
        Ave a2 = new Ave();
        Reptil a3 = new Reptil();
        Pez a4 = new Pez();
        Anfibio a5 = new Anfibio();

        System.out.println("Mamiferos : " + a1.cantidadMamiferos());
        System.out.println("Aves : " + a2.cantidadAves());
        System.out.println("Reptiles : " + a3.cantidadReptil());
        System.out.println("Peces : " + a4.cantidadPeces());
        System.out.println("Anfibios : " + a5.cantidadAnfibios());
        



    }

    public String toString(){
        if(this.zona != null)
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en" + this.habitat + ", y mi genero es " + this.genero ;
            
        return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en" + this.habitat + ", y mi genero es " + this.genero + ", la zona en la que me ubico es" + this.zona + ", en el zoo" + this.zona.zoo;
    }
    
}
