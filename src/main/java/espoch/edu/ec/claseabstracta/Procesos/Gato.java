/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.claseabstracta.Procesos;

/**
 *
 * @author Global Technology Ec
 */
public class Gato extends Felinos {
    
    @Override
    public String getNombreCientífico(){
    return " Felis silvestris catus.";
    }

    @Override
    public String getSonido(){
        return " maullido";
    }

    @Override
    public String getAlimentos(){
        return " los ratones";
    }

    @Override
    public String getHábitat(){
        return "el domestico ";
    }
    
}
