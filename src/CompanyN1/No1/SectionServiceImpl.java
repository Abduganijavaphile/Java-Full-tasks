package CompanyN1.No1;

import Company.Models.Service.Employee;
import Company.Models.Service.Position;
import Company.Models.Service.Section;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SectionServiceImpl implements SectionService{

    private List<Section> sectionList = new ArrayList<>();
    private List<Position> positionList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void addSection() {
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Description: ");
        String desc = scanner.next();
        Section s1 = new Section(name, desc);
        sectionList.add(s1);
    }

    @Override
    public void deleteSection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) + " -> " + sectionList.get(i).getName());
        }
        int n = scanner.nextInt()-1;
        sectionList.remove(n);
     /*   System.out.println("Name: ");
        String name = scanner.next();
        sectionList.removeIf(item -> item.getName().equals(name));*/
    }

    @Override
    public void editSection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) + " -> " + sectionList.get(i).getName());
        }
        int n = scanner.nextInt()-1;
        System.out.println("New section name: ");
        String name = scanner.next();
        System.out.println("New desc name: ");
        String desc = scanner.next();
        sectionList.get(n).setName(name);
        sectionList.get(n).setDesc(desc);
    }

    @Override
    public void listSections() {
        for (Section section : sectionList){
            System.out.println(section);
        }
    }

    @Override
    public void positionMenu() {
        boolean a = true;
        PositionService positionService = new PositionServiceImpl(positionList);
        while (a){
            System.out.println("1->Add position; 2->Delete position; 3->Edit position; 4->List positions; 5->exit");
            int n = scanner.nextInt();
            switch (n){
                case 1 -> {
                    positionService.addPosition();
                }
                case 2 -> {
                    positionService.deletePosition();
                }
                case 3 -> {
                    positionService.editPosition();
                }
                case 4 -> {
                    positionService.listPosition();
                }
                case 5 -> {
                    a = false;
                }
            }
        }
    }

    @Override
    public void employeeMenu() {
        EmployeeService employeeService = new EmployeeServiceImpl(employeeList,sectionList,positionList);
        boolean a =true;
        while (a) {
            System.out.println("1->Add employee; 2->delete employee; 3->list employee; 4->exit");
            int n = scanner.nextInt();
            switch (n) {
                case 1->{
                    employeeService.addEmployee();
                }
                case 2-> {
                    employeeService.deleteEmployee();
                }
                case 3-> {
                    employeeService.listEmployee();
                }
                case 4-> {
                    a = false;
                }
            }
        }
    }

    @Override
    public void employeeBySection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) +" -> "+ sectionList.get(i).getName());
        }
        int n = scanner.nextInt()-1;
        Section section = sectionList.get(n);
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.getSection() == section){
                System.out.println(employee.getFirstname()+ " "+ employee.getLastName());
            }
        }
    }
}
