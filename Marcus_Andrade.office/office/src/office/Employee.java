/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

/**
 *
 * @author marcu
 */
public class Employee {
    
    String firstname;
    private String surname;
    private String PPSN;
    private int emp_ID;
    protected double wallet;
    
  public Employee(String firstname, String surname, String PPSN, int ID){
  
      this.firstname = firstname;
      this.surname = surname;
      this.PPSN = PPSN;
      this.emp_ID = ID;
      
      this.wallet = 0;
  }
  public void work() {
  System.out.println(this.firstname + " is working now.");
  }
  public void payday(int salary){
   
      this.wallet += salary;
  }
  }
  
          
          
    

