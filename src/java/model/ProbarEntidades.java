/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


 *
 * @author T-101
 
public class ProbarEntidades {
    public static void main(String[] args) {
        try {
            //generar la secion factory
          SessionFactory fuck =  HibernateUtilidades.getSessionFactory();
          Session sesion = fuck.openSession();
          Transaction tranza = sesion.beginTransaction();
          //Ahora si veran lo que nunca en su vida
          Usuario usuario = new Usuario("campos", "yomero");
          sesion.save(usuario);
          tranza.commit();
          sesion.close();
          System.out.println("USUARIO GUARDADO CON EXITO!!");
        } catch (Exception e) {
        }
    }
    
}
*/


package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 *
 * @author T-101

*/
 
public class ProbarEntidades {
    public static void main (String[] args){
        try{
            
           DAOUsuario dao=new DAOUsuario();
           Usuario u=new Usuario("Otniel", "Martinez");
           dao.guardar(u);
            System.out.println("Transaccion Exitosa:"+dao.buscarPorId(1));
    }catch(Exception e){
            System.out.println(e.getMessage());
    }
  }
}

