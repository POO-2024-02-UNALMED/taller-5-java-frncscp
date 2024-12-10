package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){}

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static int cantidadReptiles(){ return Reptil.listado.size(); }

    @Override
    public String movimiento(){ return "reptar"; }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil iguana = new Reptil();
        iguana.setNombre(nombre);
        iguana.setEdad(edad);
        iguana.setHabitat("humedal");
        iguana.setGenero(genero);
        iguana.setColorEscamas("verde");
        iguana.setLargoCola(3);
        Reptil.iguanas ++;
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil serpiente = new Reptil();
        serpiente.setNombre(nombre);
        serpiente.setEdad(edad);
        serpiente.setHabitat("jungla");
        serpiente.setGenero(genero);
        serpiente.setColorEscamas("blanco");
        serpiente.setLargoCola(1);
        Reptil.serpientes ++;
        return serpiente;
    }

    public String getColorEscamas(){ return this.colorEscamas; }
    public void setColorEscamas( String colorEscamas ){ this.colorEscamas = colorEscamas; }

    public int getLargoCola(){ return this.largoCola; }
    public void setLargoCola( int largoCola ){ this.largoCola = largoCola; }

}