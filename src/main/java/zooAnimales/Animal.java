package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

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
        Mamifero a1 = new Mamifero();     
        Ave a2 = new Ave();
        Ave a6 = new Ave();
        Reptil a3 = new Reptil();
        Pez a4 = new Pez();
        Anfibio a5 = new Anfibio();

        return a1.cantidadMamiferos()+ 
				a2.cantidadAves() + 
				a3.cantidadReptil()+ 
				a4.cantidadPeces() + 
				a5.cantidadAnfibios();
        
        /*return "Mamiferos: "+a1.cantidadMamiferos()+"\n"+
        "Aves: " +a2.cantidadAves()+"\n"+
        "Reptiles: " + a3.cantidadReptil()+"\n"+
        "Peces: " + a4.cantidadPeces()+"\n"+
        "Anfibios: " + a5.cantidadAnfibios();
        */
    }

    public String toString(){
        if(this.zona == null)
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() ;
            
        return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + ", la zona en la que me ubico es" + this.getZona() + ", en el zoo" + this.zona.getZoo();
    }
    
  
    public static void main(String[] args){


        /*new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
        String  comp = "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";

        /*Zoologico zoo = new Zoologico();
            
        Zona z1 = new Zona();
        Zona z2 = new Zona();
        zoo.agregarZonas(z1);
        zoo.agregarZonas(z2);
        z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
        z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
        z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
        z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
        z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
        z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
        z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
        z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
        z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
        z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
        z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
        z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
        z2.agregarAnimales(Pez.crearBacalao("test", 11, "M"));
        Mamifero.crearCaballo("test", 11, "M");
        Ave.crearHalcon("test", 11, "M");
        Anfibio.crearRana("test", 11, "M");
        Reptil.crearIguana("test", 11, "M");
        Pez.crearBacalao("test", 11, "M");
*/
        //System.out.println(Animal.totalPorTipo());
        //System.out.println(comp);
        //System.out.println(Animal.totalPorTipo().getClass());
        //System.out.println(comp.getClass());
        //System.out.println(Animal.totalPorTipo().equals(comp));
        //System.out.println(Animal.totalPorTipo().compareTo(comp));
        //System.out.println(zoo.cantidadTotalAnimales());
        //System.out.println(zoo.getZona().get(0).cantidadAnimales());
        //System.out.println(Mamifero.caballos + Mamifero.leones);

    }
    
}
