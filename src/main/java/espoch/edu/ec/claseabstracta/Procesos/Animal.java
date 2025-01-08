package espoch.edu.ec.claseabstracta.Procesos;

/**
 *
 * @author Global Technology Ec
 */
public abstract class Animal {

    protected String nombre;
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    
    public abstract String getNombreCientífico();
    
    public abstract String getSonido();
    
    public abstract String getAlimentos();
    
    public abstract String getHábitat();
}
