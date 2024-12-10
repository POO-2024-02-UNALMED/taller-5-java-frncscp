public class Ave extends Animal {

    private static ArrayList<Ave> listado = new ArrayList<>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(){}

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){ return Ave.listado.size(); }

    @Override
    public String movimiento(){ return "volar"; }

    public crearHalcon(String nombre, int edad, String genero){
        Ave halcon = new Ave(nombre, edad, "montañas", genero, "café glorioso");
        halcones ++;
        listado.add(halcon);
        return halcon;
    }

    public crearAguila(String nombre, int edad, String genero){
        Ave aguila = new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
        aguilas ++;
        listado.add(aguila);
        return aguila;
    }

    public String getColorPlumas(){ return this.colorPlumas; }
    public void setColorPlumas( String colorPlumas ){ this.colorPlumas = colorPlumas; }
    
}
