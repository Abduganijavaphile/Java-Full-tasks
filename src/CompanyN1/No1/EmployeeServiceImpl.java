package CompanyN1.No1;

import Company.Models.Service.Employee;
import Company.Models.Service.Position;
import Company.Models.Service.Section;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    private Scanner scanner = new Scanner(System.in);
    private List<Employee> employeeList;
    private List<Section> sectionList;
    private List<Position> positionList;

    public EmployeeServiceImpl(List<Employee> employeeList, List<Section> sectionList, List<Position> positionList) {
        this.employeeList = employeeList;
        this.sectionList = sectionList;
        this.positionList = positionList;
    }

    @Override
    public void addEmployee() {
        System.out.print("Last name: ");
        String lastName = scanner.next();
        System.out.print("First name: ");
        String firstname = scanner.next();
        System.out.print("Middle name: ");
        String middleName = scanner.next();
        System.out.print("Birth date: ");
        String birthDate = scanner.next();
        System.out.print("Gender: ");
        char gender = scanner.next().charAt(0);

        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) + "->" +sectionList.get(i).getName());
        }
        int n = scanner.nextInt()-1;
        Section section = sectionList.get(n);
        for (int i = 0; i < positionList.size(); i++) {
            System.out.println((i+1)+" -> "+ positionList.get(i).getName());
        }
        int n1 =scanner.nextInt()-1;
        Position position = positionList.get(n1);
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        Employee e1 = new Employee(lastName,firstname,middleName,birthDate,gender,section,position,salary);
        employeeList.add(e1);
    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public void listEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
