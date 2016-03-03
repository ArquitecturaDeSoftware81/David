/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.datos;

/**
 *
 * @author damoy_000
 */
@Named(value = "tabla")
@SessionScoped
public class tabla implements Serializable {
    
    
    private List<datos> user;
    private datos selectedUser;
    
    public List<datos> getUser() {
        return user;
    }

    public datos getSelectUser() {
        return selectedUser;
    }

   
    public tabla() {
       user = new ArrayList<datos>();
       datos n1=new datos("001", "Paracetamol", "30.00","37","10 Pastillas");
       datos n2=new datos("002", "Tetramisol", "22.30","20", "12 Capsulas");
       datos n3=new datos("003", "Ambroxol", "43.50","67","8 Pastillas");
       datos n4=new datos("003", "Next", "43.50","67", "6 Capsulas");
       user.add(n1);
       user.add(n2);
       user.add(n3);
       user.add(n4);
    }
    
}
