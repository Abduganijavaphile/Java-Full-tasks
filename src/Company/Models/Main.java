package Company.Models;

import CompanyN1.No1.SectionService;
import CompanyN1.No1.SectionServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SectionService service = new SectionServiceImpl();

        boolean a = true;
        while (a){
            System.out.println("1->Add section; 2->delete section; 3->edit section; 4->list section; 5->position menu; 6->employee menu; 7->employee list by section");
            int n = scanner.nextInt();
            switch (n){
                case 1-> service.addSection();
                case 2-> service.deleteSection();
                case 3-> service.editSection();
                case 4-> service.listSections();
                case 5-> service.positionMenu();
                case 6-> service.employeeMenu();
                case 7-> service.employeeBySection();
            }
        }
    }
}
