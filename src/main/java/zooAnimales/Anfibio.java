public class Anfibio {

    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public int ranas;
    public int salamandras;
    private boolean venenoso;
    private String colorPiel;

    public Anfibio(){}

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public Static int cantidadAnfibios(){ return Anfibio.listado.size(); }

    @Override
    public String movimiento(){ return "saltar"; }

    public crearRana(String nombre, int edad, String genero){
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas ++;
        listado.add(rana);
        return rana;
    }

    public crearSalamandra(String nombre, int edad, String genero){
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras ++;
        listado.add(salamandra);
        return salamandra;
    }

    public boolean getVenenoso(){ return this.venenoso; }
    public void setVenenoso( boolean venenoso ){ this.venenoso = venenoso; }

    public String getColorPiel(){ return this.colorPiel; }
    public void setColorPiel( String colorPiel ){ this.colorPiel = colorPiel; }

}