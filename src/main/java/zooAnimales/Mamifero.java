package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado;
    public static int caballos = 0;
    public static int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        if (listado == null)
            listado = new ArrayList<Mamifero>();
        
        listado.add(this);
    }


    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        totalAnimales++;
        if (listado == null)
            listado = new ArrayList<Mamifero>();
        listado.add(this);
    }

    public boolean isPelaje() {
        return this.pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }


    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        int patas = 4;
        String habitat = "pradera";
        boolean pelaje = true;
        Mamifero c = new Mamifero(nombre, edad, habitat, genero,pelaje,patas);
        listado.add(c);
        caballos++;
        return c;


    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        int patas = 4;
        String habitat = "selva";
        boolean pelaje = true;
        Mamifero l = new Mamifero(nombre, edad, habitat, genero,pelaje,patas);
        listado.add(l);
        leones++;
        return l;

    }

}
