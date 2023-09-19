package gestion;

import java.util.ArrayList;
import gestion.Zona;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona;

    public Zoologico(){
        if (zona == null)
            zona = new ArrayList<Zona>();
    }

    public Zoologico(String n, String u){
        this.nombre=n;
        this.ubicacion=u;
        if (zona == null)
            zona = new ArrayList<Zona>();
    }

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}    

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
    };


    public void agregarZonas(Zona z){
        z.setZoo(this);
        zona.add(z);
        
    }

    public int cantidadTotalAnimales(){
        int total = 0;
        for (int i = 0;i<zona.size();i++)
            total = total + zona.get(i).cantidadAnimales();
        
        return total;
    }
}
