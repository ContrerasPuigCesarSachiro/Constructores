/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author sachiro
 */
public class Coche {

     String nombre;
     int gasolina;
     

     /* El constructor de la clase Coche esta sobrecargado */
     Coche()
     {
        nombre = null;
        gasolina = 0;
        
     }

     Coche(String nombre, int gasolina)
     {
        this.nombre = nombre;
        this.gasolina = gasolina;
        
     }

     Coche(Coche gas)
     {
        nombre = gas.getNombre();
        gasolina = gas.getGasolina();
       
     }

     void setNombre(String n)
     {
        nombre = n;
     }

     String getNombre()
     {
        return nombre;
     }

     /* El metodo setGasolina() está sobrecargado */
     void setGasolina(int g)
     {
        gasolina = g;
     }

     void setGasolina(float g)
     {
        gasolina = (int)g;
     }

     int getGasolina()
     {
        return gasolina;
     }

    
     public void acelerar(){
     
     }
    
    
}
