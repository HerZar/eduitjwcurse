/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.database;

/**
 *
 * @author a211589
 */
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public abstract class SessionManager {

    
    public static SessionFactory factory; 
    
    public SessionManager() {
    }
    
    public static SessionFactory getSessionFactory() throws HibernateException {
        if (factory == null){
            // Instancia un objeto del tipo Configuration
            Configuration config = new Configuration();
            
            
           
            Properties props = new Properties();

            // Establece el driver de conexion dependiente del RDBMS
            props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

            // Establece la url de conexion dependiente del RDBMS
            props.put("hibernate.connection.url", "jdbc:mysql://localhost/j2ee-web");

            // Establece el usuario
            props.put("hibernate.connection.username", "root");

            // Establece la clave
            props.put("hibernate.connection.password", "libra");

            // Establece el dialecto a utilizar
            props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

            // Establece el uso de logging, deberá existir el archivo log4j.properties
            props.put("hibernate.show_sql", "true");
     //       props.put("hibernate.hbm2ddl.auto", "create");

            // Establece las propiedades de configuracion
            config.setProperties(props);

            //config.addAnnotatedClass(ar.com.listaweb.entidades.AfiliadoF.class);
            config.addAnnotatedClass(ar.javaweb.entides.Alumno.class);
            
            
            // Guarda la fabrica de sesiones
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
            factory = config.buildSessionFactory(builder.build());
        }
        // Retorna una sesion de trabajo
        return factory;



    }
    
}
