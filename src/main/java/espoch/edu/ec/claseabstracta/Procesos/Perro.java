/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.claseabstracta.Procesos;

/**
 *
 * @author Global Technology Ec
 */
public class Perro extends Canido {
    
    @Override
    public String getNombreCientífico(){
    return "Canislupus familiaris";
    }
    @Override
    public String getSonido(){
        return "ladrido";
    }

    @Override
    public String getAlimentos(){
        return " carnivora";
    }

    @Override
    public String getHábitat(){
        return " domestico";
    }
    
}
