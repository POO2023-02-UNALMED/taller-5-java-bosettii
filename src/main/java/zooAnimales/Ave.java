package zooAnimales;

import java.util.ArrayList;


public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;

    public Ave() {
        if (listado == null)
            listado = new ArrayList<Ave>();
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        totalAnimales++;
        if (listado == null)
            listado = new ArrayList<Ave>();
        listado.add(this);
    }

    public String getColorPlumas() {
        return this.colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";

    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        String colorPlumas = "cafe glorioso" ;
        String habitat = "montanas";
        Ave h = new Ave(nombre, edad, habitat, genero, colorPlumas);
        listado.add(h);
        halcones++;
        return h;
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        String colorPlumas = "blanco y amarillo" ;
        String habitat = "montanas";
        Ave a = new Ave(nombre, edad, habitat, genero, colorPlumas);
        listado.add(a);
        aguilas++;
        return a;

    }

}
