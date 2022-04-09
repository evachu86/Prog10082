/* Employee.java
 * Author: Yiwen Chu
 * Date: April 7, 2021 
 
 * Description: The Value object Employee 
 * stores name, position and salary information.
 */
package exercise.assignment.YiwenChuAssignment5;

public class Employee {

    private String name;
    private String position;
    private double hoursWorked;
    private double hourlyRate;
    
    /**
    The constructor is used in initialization without input parameter; 
    */
    public Employee() {
        
    }

    /**
    The constructor is used in initialization 
    with employee's name and position; 
    */
    public Employee(String name, String position) {
        
        this.name = name;
        this.position = position;
    }
    
    /**
    The accessor for employee's name.
    */
    public String getName() {
        
        return name;
    }
    
    /**
    The mutator for employee's name.
    */
    public void setName(String name) {
        
        this.name = name;
    }
    
    /**
    The accessor for employee's job title.
    */
    public String getPosition() {
        
        return position;
    }
    
    /**
    The mutator for employee's job title.
    */
    public void setPosition(String position) {
        
        this.position = position;
    }
    
    /**
    The accessor for employee's worked hours.
    */
    public double getHoursWorked() {
        
        return hoursWorked;
    }
    
    /**
    The mutator for employee's worked hours.
    Negative value is unacceptable.
    */
    public void setHoursWorked(double hoursWorked) throws Exception {
        
        if(hoursWorked < 0) 
            throw new Exception("Hours worked must be a positive number");
        this.hoursWorked = hoursWorked;
    }
    
    /**
    The accessor for employee's hourly pay.  
    */
    public double getHourlyRate() {
        
        return hourlyRate;
    }
    
    /**
    The mutator for employee's hourly pay.   
    Negative value is unacceptable.
    */
    public void setHourlyRate(double hourlyRate) throws Exception {
        
        if(hourlyRate < 0)
            throw new Exception("Hourly rate must be a positive number");
        this.hourlyRate = hourlyRate;
    }
    
    /**
    The method calculates payment to the employee.   
    */
    public double getPayment() {
        
        return this.hoursWorked * this.hourlyRate; 
    }
    
    /**
    The method prints formatted message of employee.   
    */
    public String toString() {

        // Formatted value for each column.
        String formattedName = String.format("%-10s", this.name),
            formattedPosition = String.format("%-8s", this.position),
            formattedHoursWorked = String.format("%5.2f",this.hoursWorked),
            formattedHourlyRate = String.format("%4.2f",this.hourlyRate),
            formattedPayment = String.format("%7.2f",getPayment());
        
        // The format for each rows, including the header.
        // Columns will align according to the length of formatted information,
        // and insert the interval between them.
        String rowFormat = "%-"+formattedName.length()+"s  "+
                "%-"+formattedPosition.length()+"s  "+  
                "%"+formattedHoursWorked.length()+"s  "+
                "%"+formattedHourlyRate.length()+"s  "+
                "%"+formattedPayment.length()+"s%n";
        
        // Generate header according string alignment.
        String header = String.format(rowFormat, 
                "Emp. Name", "Position", "Hours", "Rate", "Payment");
        
        // Horizontal line for separation of 
        // input data, header and formatted information.
        String hr = header.replaceAll("[^\r\n]", "-");
        
        // Combine the string as the format below:
        // ------------------------------------------------
        // Emp. Name        Position   Hours  Rate  Payment
        // ------------------------------------------------
        // Employee's Name  job title   0.00  0.00     0.00
        return hr+header+hr+
            String.format(rowFormat, 
                    this.name, this.position, formattedHoursWorked, 
                    formattedHourlyRate, formattedPayment);
    }
}