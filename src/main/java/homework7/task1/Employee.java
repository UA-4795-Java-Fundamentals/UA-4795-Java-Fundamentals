package homework7.task1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Employee implements Payment, Comparable<Employee> {
    String employeeId;

    @Override
    public abstract double calculatePay();

    public int compareTo(Employee other) {
       return Double.compare(other.calculatePay(), this.calculatePay());
    }
}
