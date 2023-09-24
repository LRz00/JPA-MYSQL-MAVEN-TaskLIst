/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.DAO;
import br.com.ifba.JPATeste.Models.AbstractEntity;
import br.com.ifba.JPATeste.Instancias.EMFInstance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;
/**
 *
 * @author lara
 * @param <T>
 */
public class GenericDAO<T extends AbstractEntity> {
    protected static EntityManager em;
    
    static{
        EntityManagerFactory emf = EMFInstance.getInstance();
        em = emf.createEntityManager();
    }
    
    public void create(T entity){
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    public T read(Long id){
        return (T) em.find(getTypeClass(), id);
    }
    public List<T> readAll(){
        String entityName = getTypeClass().getName();
        TypedQuery<T> query = em.createQuery("SELECT e FROM " + entityName + " e", getTypeClass());
        return query.getResultList();
    }
    
    public void update(T entity){
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    } 
    public void delete(Long id){
         T entity = em.find(getTypeClass(), id);
    if (entity != null) {
        try {
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    }
    
     private Class<T> getTypeClass() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        return (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }
}
