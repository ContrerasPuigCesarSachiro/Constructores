/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Contreras Puig César Sachiro
 */
public class Libro {
     String nombre;
     String editorial;
     String autor;

     /* El constructor de la clase Libro esta sobrecargado */
     Libro( )
     {
        nombre = null;
        editorial = null;
        autor = null;
     }

     Libro(String nombre,String editorial, String autor)
     {
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
     }

     Libro(Libro lib)
     {
        nombre = lib.getNombre();
        editorial = lib.getEditorial();
        autor = lib.getAutor();
     }

     void setNombre(String n)
     {
        nombre = n;
     }

     String getNombre()
     {
        return nombre;
     }

   
     void setEditorial(String e)
     {
        editorial = e;
     }

     String getEditorial()
     {
        return editorial;
     }

     void setAutor(String a)
     {
        autor = a;
     }

     String getAutor()
     {
        return autor;
     }

}
