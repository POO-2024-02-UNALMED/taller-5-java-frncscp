package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado = new ArrayList<>();
    public int iguanas;
    public int serpientes;
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
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        Reptil.iguanas ++;
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        Reptil.serpientes ++;
        return serpiente;
    }

    public String colorEscamas(){ return this.colorEscamas; }
    public void setColorEscamas( String colorEscamas ){ this.colorEscamas = colorEscamas; }

    public int getLargoCola(){ return this.largoCola; }
    public void setLargoCola( int largoCola ){ this.largoCola = largoCola; }

}