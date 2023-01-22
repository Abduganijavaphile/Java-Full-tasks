package CompanyN1.No1;

import Company.Models.Service.Position;

import java.util.List;
import java.util.Scanner;

public class PositionServiceImpl implements PositionService{

    private Scanner scanner = new Scanner(System.in);
    private List<Position> positionList;

    public PositionServiceImpl(List<Position> positionList) {
        this.positionList = positionList;
    }

    @Override
    public void addPosition() {
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("desc: ");
        String desc = scanner.next();
        Position p1 = new Position(name, desc);
        positionList.add(p1);
    }

    @Override
    public void deletePosition() {

    }

    @Override
    public void editPosition() {

    }

    @Override
    public void listPosition() {
        for (Position position : positionList) {
            System.out.println(position);
        }
    }
}
