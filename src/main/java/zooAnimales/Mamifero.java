import java.util.ArrayList;


import java.util.ArrayList;

public class Mamifero extends Animal{

    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static int cantidadMamiferos(){ return Mamifero.listado.size();}

    public Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos ++;
        listado.add(caballo);
        return caballo;
    }

    public Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones ++;
        listado.add(leon);
        return leon;
    }

    public boolean getPelaje(){ return this.pelaje; }
    public void setPelaje( boolean pelaje ){ this.pelaje = pelaje; }

    public int getPatas(){ return this.patas; }
    public void setPatas( int patas ){ this.patas = patas; }

}
