/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author sachs
 */
public class Plibro {
    

   void imprimeLibro(Libro lib)
   {
     //   lib.nombre equivale en este caso a lib.getNombre()
     System.out.println("\nNombre: " + lib.nombre );
     System.out.println("Editorial: " + lib.getEditorial() );
     System.out.println("Autor: " + lib.getAutor() +"\n");
   }

   public static void main(String args[])
   {
      Plibro prog = new Plibro( );
      /* Se declaran dos objetos de la clase Usuario4 */
      Libro lib1,lib2;

      /* Se utiliza el constructor por omisión */
      lib1 = new Libro( );
      prog.imprimeLibro(lib1);

     /* Se utiliza el segundo constructor de Usuario4 */
      lib2 = new Libro("Percy Jackson","Salamandra","Rick Riordan");
      prog.imprimeLibro(lib2);

     /* Se utiliza el tercer constructor de Usuario4 */
      lib1 = new Libro(lib2);

      lib1.setEditorial("V&R");
      

      prog.imprimeLibro(lib1);
   
   }


}
