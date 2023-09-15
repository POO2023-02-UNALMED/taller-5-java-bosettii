package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    public static ArrayList<Zona> zona;
    //private Zona[] zona;

    public Zoologico(){
    }

    public Zoologico(String n, String u){
        this.nombre=n;
        this.ubicacion=u;
    }

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}    

    public void agregarZonas(Zona z){
        zona.add(z);
    }

    public int cantidadTotalAnimales(){
        int total = 0;
        for (int i = 0;i<zona.size();i++)
            total = total +zona.get(i).cantidadAnimales();
        
        return total;
    }
}
