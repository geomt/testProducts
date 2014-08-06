/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apps;

import appEntities.Customer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Aison
 */
@Local
public interface AllCustomerLocal {
  public List<Customer> getAllCustomer();
}
