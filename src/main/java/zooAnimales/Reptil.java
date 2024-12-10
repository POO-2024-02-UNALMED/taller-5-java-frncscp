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
    }

    public static int cantidadReptiles(){ return Reptil.listado.size(); }

    @Override
    public String movimiento(){ return "reptar"; }

    public Reptil crearIguana(String nombre, int edad, String genero){
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas ++;
        listado.add(iguana);
        return iguana;
    }

    public Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes ++;
        listado.add(serpiente);
        return serpiente;
    }

    public String colorEscamas(){ return this.colorEscamas; }
    public void setColorEscamas( String colorEscamas ){ this.colorEscamas = colorEscamas; }

    public int getLargoCola(){ return this.largoCola; }
    public void setLargoCola( int largoCola ){ this.largoCola = largoCola; }

}