/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

import java.util.ArrayList;
import Utilities.InputUtilities;
import office.Employee;




/**
 *
 * @author marcu
 */
public class Office {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int employeeID = 1;
        
        ArrayList<Employee> staffList = new ArrayList<Employee>();
        
        for(int i=0; i<5; i++){
            
            String fname = InputUtilities.getUserText("insert your first name");
            String sname = InputUtilities.getUserText("insert your surname");
            String PPSN  = InputUtilities.getUserText("insert your PPSN");
           
          
           Employee staffMember = new Employee(fname, sname , PPSN, employeeID);
           Manager managerStaff = new Manager(fname, sname, PPSN, employeeID);
          
           staffList.add(staffMember);
           staffList.add(managerStaff);
           employeeID++;
        
           for (Employee e: staffList){
               
               e.work();
               e.payday(employeeID);
           }
        }   

            
            
        }
        
    }
    

