package zooAnimales;

import java.util.ArrayList;


public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;


    public Pez() {
        if (listado == null)
            listado = new ArrayList<Pez>();
        listado.add(this);
    }


    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        totalAnimales++;
        if (listado == null)
            listado = new ArrayList<Pez>();
        listado.add(this);
    }


    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return this.cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }


    public static int cantidadPeces(){
        return listado.size();
    }

    public String movimiento(){
        return "nadar";

    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        String colorEscamas =  "rojo";
        int cantidadAletas = 6;
        String habitat = "oceano";
        Pez s = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        listado.add(s);
        salmones++;
        return s;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        String colorEscamas =  "gris";
        int cantidadAletas = 6;
        String habitat = "oceano";
        Pez b = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        listado.add(b);
        bacalaos++;
        return b;
    }
}
