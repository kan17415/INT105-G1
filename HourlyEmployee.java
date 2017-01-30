/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4inher;

/**
 *
 * @author INT105
 */
public class HourlyEmployee extends Employee {
    private double ratePerHour;
    
public HourlyEmployee(String name, long cardId, String surname,
        double salary,String position,double ratePerHour){
    super(name,cardId,surname,salary,position);
    this.ratePerHour = ratePerHour;

    System.out.print("Hour constructor is working !");
}

    HourlyEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    

@Override
public String toString() {
    return super.toString()+"HourlyEmployee{" + "ratePerHour=" + ratePerHour + '}';
}


    
}
