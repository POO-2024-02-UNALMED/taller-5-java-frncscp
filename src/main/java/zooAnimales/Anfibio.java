package zooAnimales;
import java.util.ArrayList;


public class Anfibio extends Animal {

    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private boolean venenoso;
    private String colorPiel;

    public Anfibio(){}

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static int cantidadAnfibios(){ return Anfibio.listado.size(); }

    @Override
    public String movimiento(){ return "saltar"; }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        Anfibio.ranas ++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        Anfibio.salamandras ++;
        return salamandra;
    }

    public boolean isVenenoso(){ return this.venenoso; }
    public void setVenenoso( boolean venenoso ){ this.venenoso = venenoso; }

    public String getColorPiel(){ return this.colorPiel; }
    public void setColorPiel( String colorPiel ){ this.colorPiel = colorPiel; }

}