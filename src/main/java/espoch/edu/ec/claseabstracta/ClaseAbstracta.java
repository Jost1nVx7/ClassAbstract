
package espoch.edu.ec.claseabstracta;

import espoch.edu.ec.claseabstracta.Procesos.Animal;
import espoch.edu.ec.claseabstracta.Procesos.Gato;
import espoch.edu.ec.claseabstracta.Procesos.Leon;
import espoch.edu.ec.claseabstracta.Procesos.Lobo;
import espoch.edu.ec.claseabstracta.Procesos.Perro;

public class ClaseAbstracta {

    public static void main(String[] args) {
        
        Animal[] animales = new Animal[4];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Leon();
        animales[3] = new Lobo();
        
        
        for (int i = 0; i < animales.length; i++) {
            
           
            System.out.println("Nombre cientifico es: " + animales[i].getNombreCientífico());
            System.out.println("El alimento del animal es: " + animales[i].getAlimentos());
            System.out.println("El habitat del animal es: " + animales[i].getHábitat());
            System.out.println("El sonido del Animal es: " + animales[i].getSonido());
            System.out.println(" ");
        }
        
    } 
}
