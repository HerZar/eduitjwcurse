/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.database;



import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author educacionit
 * @param <E>
 * @param <PK>
 */
public abstract class GenericRepository <E,PK extends Serializable>{
 
    private SessionFactory factory;

    public SessionFactory getFactory() {
        return factory;
    }

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }
    
 
    public GenericRepository(SessionFactory a) {
        if (a == null) {
            throw new IllegalArgumentException("Session Factory null");
        }
        this.factory = a;
    }
    
    
    public PK save(E a){
        Session s = this.factory.openSession();
        Transaction tx = null;
        PK id = null;
        try {
            tx = s.beginTransaction();
            id = (PK) s.save(a);
            tx.commit();
        } catch(HibernateException e){
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            s.close();
        }
        
        return id;
        
    }
      
    public void update(E p){
        Session s = this.factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.update(p);
            tx.commit();
        } catch(HibernateException e){
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            s.close();
        }
    }
    
    public void delete(E p){
        Session s = this.factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.delete(p);
            tx.commit();
        } catch(HibernateException e){
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            s.close();
        }
    }
    
    public E getById(PK id){
        Session s = this.factory.openSession();
        E p = (E) s.get( getType(), id);
        s.close();
        return p;
    }
    
    
    public List<E> getAll(){
        Session s = this.factory.openSession();
        List<E> aux = s.createQuery("from "+getType().getName()).list();
        s.close();
        return aux;
    }
    
     private Class getType(){
         /* Verion en una muchas lineas
         Class clazz = this.getClass();
         ParameterizedType sclazz = (ParameterizedType)clazz.getGenericSuperclass();
         Type[] generics = sclazz.getActualTypeArguments();
         return (Class) generics[0];*/
         
         //version en una sola linea;
         return (Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
         
     }
    
}
