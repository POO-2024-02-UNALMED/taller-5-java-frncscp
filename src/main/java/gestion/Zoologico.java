package gestion;
import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona){ this.zonas.add(zona); }

    public int cantidadTotalAnimales(){

        int ttl = 0;
        for (int i = 0; i < zonas.size(); i++){
            ttl += zonas.get(i).getAnimales.size();
        }

        return ttl;
    }

    public String getNombre(){ return this.nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getUbicacion(){ return this.ubicacion; }
    public void setUbicacion(String ubicacion){ this.ubicacion = ubicacion; }   
}