import gestion.Zona;
import zooAnimales.*;

public class Animal {

    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){
        totalAnimales ++;
    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales ++;
    }

    public String movimiento(){ return "desplazarse"; }
    public void totalPorTipo(){
      
      int mamifero = Mamifero.cantidadMamiferos();
      int ave = Ave.cantidadAves();
      int anfibio = Anfibio.cantidadAnfibios();
      int reptil = Reptil.cantidadReptiles();
      int pez = Pez.cantidadPeces();


      return("Mamiferos: "+ mamifero + "\nAves: "+ ave + "\nReptiles: "+ reptil + "\nPeces: "+ pez + "\nAnfibios: " +anfibio );
  }

  @Override
  public String toString(){ 
    if  (zona == null){
      System.out.println("Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi género es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el " + this.zona.getZoo().getNombre()); 
    } else {
      System.out.println("Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi género es " + this.genero); 
    }
  
  }

  public static int getTotalAnimales() { return totalAnimales; }
  public static void setTotalAnimales(int totalAnimales){ Animal.totalAnimales = totalAnimales; }

  public String getNombre(){ return nombre; }
  public void setNombre(String nombre){ this.nombre = nombre; }

  public int getEdad() { return edad; }
  public void setEdad(int edad){ this.edad = edad; }

  public String getHabitat(){ return habitat; }
  public void setHabitat(String habitat){ this.habitat = habitat; }

  public String getGenero(){ return genero; }
  public void setGenero(String genero){ this.genero = genero; }

  public Zona getZona() { return zona; }
  public void setZona(Zona zona){ this.zona = zona; }

}