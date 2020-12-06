/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;
import office.Employee;
/**
 *
 * @author marcu
 */
public class Manager extends Employee{
    ////inherits everything public and protected from Employee
    //it's how the manager is going to work
    //Contructor
        public Manager(String firstname, String surname, String PPSN, int ID){
            super(firstname, surname, PPSN, ID); //making an employee
            wallet = 20; // manager gets bonus for every problem solved
                
        }
    @Override
    public void work(){
        System.out.println(this.firstname + " is the manager and is going to solve your problem.");
    }
    }
 