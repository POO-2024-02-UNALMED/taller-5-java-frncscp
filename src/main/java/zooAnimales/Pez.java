package zooAnimales;
import java.util.ArrayList;


public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int bacalaos;
    public static int salmones;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){ listado.add(this); }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public static int cantidadPeces(){ return Pez.listado.size(); }
    
    @Override
    public String movimiento(){ return "nadar"; }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez salmon = new Pez();
        salmon.setNombre(nombre);
        salmon.setEdad(edad);
        salmon.setHabitat("oceano");
        salmon.setGenero(genero);
        salmon.setColorEscamas("rojo");
        salmon.setCantidadAletas(6);
        Pez.salmones ++;
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez bacalao = new Pez();
        bacalao.setNombre(nombre);
        bacalao.setEdad(edad);
        bacalao.setHabitat("oceano");
        bacalao.setGenero(genero);
        bacalao.setColorEscamas("gris");
        bacalao.setCantidadAletas(6);
        Pez.bacalaos ++;
        return bacalao;
    }

    public String getColorEscamas(){ return this.colorEscamas; }
    public void setColorEscamas( String colorEscamas ){ this.colorEscamas = colorEscamas; }

    public int getCantidadAletas(){ return this.cantidadAletas; }
    public void setCantidadAletas( int cantidadAletas ){ this.cantidadAletas = cantidadAletas; }

}
