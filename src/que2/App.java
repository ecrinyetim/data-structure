package que2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Node ceo = new Node("David");

        CompanyTree company = new CompanyTree(ceo);

        Node departmentManager = new Node("Alice");
        Node departmentManager2 = new Node("Josh");

        company.addDepartmentManager(departmentManager, ceo);
        company.addDepartmentManager(departmentManager2, ceo);

        Node employee1 = new Node("Abraham");
        Node employee2 = new Node("Taylor");

        company.addEmployee(employee1, departmentManager);
        company.addEmployee(employee2, departmentManager2);

        // company.printTree(); // Ağaç yapısını yazdır

        Node abc = company.findDepartmen(employee1, company);
        System.out.println(abc.name);

    }

}
