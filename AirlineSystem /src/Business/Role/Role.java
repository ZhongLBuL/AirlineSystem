/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        AirlineAdmin("AirlineAdmin"),
        Customer("Customer"),
        Ackemma("Ackemma"),
        MOP("MOP"),
        Seller("Seller"),
        AircraftCrew("AircraftCrew"),
        Commander("Commander"),
        Announcer("Announcer"),
        TicketChecker("TicketChecker"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public RoleType type;

    public RoleType getType() {
        return type;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);
    
    

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}