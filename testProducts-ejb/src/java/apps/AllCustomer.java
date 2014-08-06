/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apps;

import appEntities.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Aison
 */
@Stateless
public class AllCustomer implements AllCustomerLocal {

  @PersistenceContext(unitName = "testProducts-ejbPU")
    private EntityManager em;

          
    
    
    @Override
    public List<Customer> getAllCustomer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Query query = em.createNamedQuery("Customer.findAll");
        // set paramter for query
               // get results for query
        List<Customer> customersInCity = query.getResultList();
        List<Customer> AllCust= query.getResultList();
        
        return AllCust;
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
