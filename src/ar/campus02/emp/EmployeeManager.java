package ar.campus02.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    Employee findByEmpNumber(int number) {
        for (Employee emp : employees) {
            if (number == emp.getEmpNumber()) {
                return emp;
            }
        }
        return null;
    }

    ArrayList<Employee> findByDepartment(String department) {
       ArrayList<Employee> depmEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getDepartment().equals(department)) {
                depmEmployees.add(emp);
            }
        }
        return depmEmployees;
    }
    Employee findByMaxSalary() {
        double max = 0;
        Employee maxE = null;
        for (Employee e : employees) {
            if (e.getSalary() > max) {
                max = e.getSalary();
                maxE = e;
            }
        }
        return maxE;
    }
}
