 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.database;

import ar.javaweb.entides.Alumno;
import org.hibernate.SessionFactory;

/**
 *
 * @author a211589
 */
public class AlumnoDao extends GenericRepository<Alumno, Long>{
    
    public AlumnoDao(SessionFactory a) {
        super(a);
    }
    
    
    
}
