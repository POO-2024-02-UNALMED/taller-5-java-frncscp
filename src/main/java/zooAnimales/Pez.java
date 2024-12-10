import java.util.ArrayList;


public class Pez {

    private static ArrayList<Pez> listado = new ArrayList<>();
    public int bacalaos;
    public int salmones;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){}

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, String cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces(){ return Pez.listado.size(); }
    
    @Override
    public string movimiento(){ return "nadar"; }

    public Pez crearSalmon(String nombre, int edad, String genero){
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones ++;
        listado.add(salmon);
        return salmon;
    }

    public Pez crearBacalao(String nombre, int edad, String genero){
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos ++;
        listado.add(bacalao);
        return bacalao;
    }

    public String getColorEscamas(){ return this.colorEscamas; }
    public void setColorEscamas( String colorEscamas ){ this.colorEscamas = colorEscamas; }

    public int getCantidadAletas(){ return this.cantidadAletas; }
    public void setCantidadAletas( int cantidadAletas ){ this.cantidadAletas = cantidadAletas; }

}
