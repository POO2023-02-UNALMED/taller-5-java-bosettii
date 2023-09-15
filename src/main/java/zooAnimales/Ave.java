package zooAnimales;

import java.util.ArrayList;


public class Ave extends Animal{
    public static ArrayList<Ave> listado;
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;
    private static int cantidad = 0;

    public Ave() {
        cantidad++;
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        totalAnimales++;
        cantidad++;
    }

    public String getColorPlumas() {
        return this.colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    public int cantidadAves(){
        return cantidad;
    }

    @Override
    public String movimiento(){
        return "volar";

    }

    public void crearHalcon(String nombre, int edad, String genero){
        String colorPlumas = "cafe glorioso" ;
        String habitat = "montanas";
        Ave h = new Ave(nombre, edad, habitat, genero, colorPlumas);
        listado.add(h);
        halcones++;

    }

    public void crearAguila(String nombre, int edad, String genero){
        String colorPlumas = "blanco y amarillo" ;
        String habitat = "montanas";
        Ave a = new Ave(nombre, edad, habitat, genero, colorPlumas);
        listado.add(a);
        
        aguilas++;

    }

}