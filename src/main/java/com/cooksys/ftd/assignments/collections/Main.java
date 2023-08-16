package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {
        Manager manager2 = new Manager("Steve");
        Manager manager1 = new Manager("Bill", manager2);
        Worker worker1 = new Worker("Matt", manager1);

        OrgChart chart = new OrgChart();

        chart.addEmployee(worker1);
        chart.addEmployee(manager1);
        System.out.println("All Employees: ");
        chart.getAllEmployees();

        System.out.println("All Managers: ");
        chart.getAllManagers();

        System.out.println("Direct Subordinates of Bill: ");
        chart.getDirectSubordinates(manager1);

        System.out.println("Full Hierarchy: ");
        chart.getFullHierarchy();
    }

}
