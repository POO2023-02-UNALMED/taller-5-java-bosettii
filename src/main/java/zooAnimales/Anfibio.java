package zooAnimales;

import java.util.ArrayList;


public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static  int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;


    public Anfibio() {
        if (listado == null)
            listado = new ArrayList<Anfibio>();
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        totalAnimales++;
        if (listado == null)
            listado = new ArrayList<Anfibio>();
        
        listado.add(this);
    }


    public String getColorPiel() {
		return this.colorPiel;
	}

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
		return this.venenoso;
	}

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }


    public static int cantidadAnfibios(){
        return listado.size();
    }

    public String movimiento(){
        return "saltar";

    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        String colorPiel = "rojo";
        boolean venoso = true;
        String habitat = "selva";
        Anfibio r = new Anfibio(nombre, edad, habitat, genero, colorPiel, venoso);
        listado.add(r);
        ranas++;
        return r;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        String colorPiel = "negro y amarillo";
        boolean venoso = false;
        String habitat = "selva";
        Anfibio s = new Anfibio(nombre, edad, habitat, genero, colorPiel, venoso);
        listado.add(s);
        salamandras++;
        return s;

    }
}
