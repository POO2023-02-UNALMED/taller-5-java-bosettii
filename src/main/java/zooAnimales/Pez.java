package zooAnimales;

import java.util.ArrayList;


public class Pez extends Animal{
    public static ArrayList<Pez> listado;
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int catidadAletas;
    private static int cantidad = 0;


    public Pez() {
        cantidad++;
    }


    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int catidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.catidadAletas = catidadAletas;
        totalAnimales++;
        cantidad++;
    }


    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCatidadAletas() {
        return this.catidadAletas;
    }

    public void setCatidadAletas(int catidadAletas) {
        this.catidadAletas = catidadAletas;
    }


    public int cantidadPeces(){
        return cantidad;
    }

    public String movimiento(){
        return "nadar";

    }

    public void crearSalmon(String nombre, int edad, String genero){
        String colorEscamas =  "rojo";
        int cantidadAletas = 6;
        String habitat = "oceano";
        Pez s = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        listado.add(s);
        salmones++;

    }

    public void crearBacalao(String nombre, int edad, String genero){
        String colorEscamas =  "gris";
        int cantidadAletas = 6;
        String habitat = "oceano";
        Pez b = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        listado.add(b);
        bacalaos++;

    }
}
