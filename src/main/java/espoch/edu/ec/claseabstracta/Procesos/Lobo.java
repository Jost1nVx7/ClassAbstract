/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.claseabstracta.Procesos;

/**
 *
 * @author Global Technology Ec
 */
public class Lobo extends Canido {
    
    @Override
    public String getNombreCientífico(){
    return " Canislupus";
    }
    
    @Override
    public String getSonido(){
        return " aullido";
    }

    @Override
    public String getAlimentos(){
        return " carnivora";
    }

    @Override
    public String getHábitat(){
        return " el bosque";
    }
}
