package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    public static ArrayList<Reptil> listado;
    public static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;
    private static int cantidad = 0;


    public Reptil() {
        cantidad++;
        if (listado == null)
            listado = new ArrayList<Reptil>();
    }


    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        totalAnimales++;
        cantidad++;
        if (listado == null)
            listado = new ArrayList<Reptil>();
    }


    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return this.largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public String cantidadReptil(){
        return "Reptiles: " + cantidad + "\n";
    }

    public String movimiento(){
        return "reptar";

    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        String colorEscamas = "verde";
        int largoCola = 3;
        String habitat = "humedal";
        Reptil i = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
        listado.add(i);
        iguanas++;
        return i;

    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        String colorEscamas = "blanco";
        int largoCola = 1;
        String habitat = "jungla";
        Reptil s = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
        listado.add(s);
        serpientes++;
        return s;

    }

}
