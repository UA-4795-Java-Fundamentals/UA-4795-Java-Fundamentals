package ex1;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class SalariedEmployee extends Employee implements Payment {

   private String socialSecurityNumber = "";
   private int hourlyRate = 0;
   private int numberOfHoursWorked = 0;
   private double averegeMonthlySalary = 0;
   static Random random = new Random();


   public SalariedEmployee(String employeeld, String socialSecurityNumber) {
       this.employeeld = employeeld;
       this.socialSecurityNumber = socialSecurityNumber;
       this.averegeMonthlySalary = 0;
   }

   public void inPutAveregeMonthlySalary(){
       hourlyRate = random.nextInt(100);
       numberOfHoursWorked = random.nextInt(100);
   }
   public Double getAveregeMonthlySalary(){
       return averegeMonthlySalary;
   }
    @Override
    public double calculatePay() {
       this.averegeMonthlySalary = hourlyRate * numberOfHoursWorked;
       return averegeMonthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeld='" + employeeld + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", averegeMonthlySalary= " + averegeMonthlySalary +
                '}';
    }
}
