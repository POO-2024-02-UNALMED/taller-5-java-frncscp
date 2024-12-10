import zooAnimales.Anfibio;
import zooAnimales.Animal;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

public class Main{

    public static void main(String[] args) {
        // Ejecutar las pruebas
        
        testToString();
        testMovimiento();
        testTotalTipo();
    }

    public static void testTotalTipo() {
        // Crear instancias de animales
        new Anfibio();
        new Anfibio();
        new Mamifero();
        new Mamifero();
        new Mamifero();
        new Reptil();
        new Pez();
        new Ave();
        new Ave();
        
        // Esperado
        String comp = "Mamiferos: 4\n" + 
                       "Aves: 4\n" + 
                       "Reptiles: 2\n" + 
                       "Peces: 2\n" + 
                       "Anfibios: 3";
        
        // Comprobar si el resultado es correcto
        String result = Animal.totalPorTipo();
        if (result.equals(comp)) {
            System.out.println("testTotalTipo: PASADO");
        } else {
            System.out.println("testTotalTipo: FALLADO");
            System.out.println("Esperado: " + comp);
            System.out.println("Obtenido: " + result);
        }
    }

    public static void testToString() {
        Ave an2 = new Ave("paloma", 5, "ciudad", "F", "gris");
        
        // Esperado
        String comp = "Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F";
        
        // Comprobar si el resultado es correcto
        if (an2.toString().equals(comp)) {
            System.out.println("testToString: PASADO");
        } else {
            System.out.println("testToString: FALLADO");
            System.out.println("Esperado: " + comp);
            System.out.println("Obtenido: " + an2.toString());
        }
    }

    public static void testMovimiento() {
        Animal a1 = new Anfibio();
        Animal a2 = new Ave();
        Animal a3 = new Mamifero();
        Animal a4 = new Pez();
        Animal a5 = new Reptil();
        
        // Comprobar si los métodos de movimiento son correctos
        boolean ok = false;
        if (a1.movimiento().equals("saltar") && a2.movimiento().equals("volar")
            && a3.movimiento().equals("desplazarse") && a4.movimiento().equals("nadar")
            && a5.movimiento().equals("reptar")) {
            ok = true;
        }

        if (ok) {
            System.out.println("testMovimiento: PASADO");
        } else {
            System.out.println("testMovimiento: FALLADO");
        }
    }
}
