// Base class
class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String empName, int empId) {
        this.name = empName;
        this.employeeId = empId;
    }

    public void display() {
        System.out.println("Employee : " + name + ", ID : " + employeeId);
    }
}

// Single Inheritance
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String empName, int empId, String lang) {
        super(empName, empId);
        this.programmingLanguage = lang;
    }

    public void show() {
        display();
        System.out.println("Specialization : Developer, Programming Language : " + programmingLanguage);
    }
}

// Interfaces for Multiple Inheritance
interface ProjectManager {
    void manageProject();
}
interface TeamLead {
    void leadTeam();
}

// Multiple Inheritance using Interfaces
class TechLead extends Employee implements ProjectManager, TeamLead {
    private String projectManaged;
    private int teamSize;

    public TechLead(String empName, int empId, String project, int teamSize) {
        super(empName, empId);
        this.projectManaged = project;
        this.teamSize = teamSize;
    }

    public void displayInfo() {
        display();
        manageProject();
        leadTeam();
    }

    public void manageProject() {
        System.out.println("Project Manager managing project : " + projectManaged);
    }

    public void leadTeam() {
        System.out.println("Team Lead leading a team of " + teamSize + " members");
    }
}

// Multi-level Inheritance
class HRManager extends Employee {
    public HRManager(String empName, int empId) {
        super(empName, empId);
    }

    public void handleHRDuties() {
        System.out.println("HR Manager handling human resources duties");
    }
}

class HRDirector extends HRManager {
    public HRDirector(String empName, int empId) {
        super(empName, empId);
    }

    public void manageHRDepartment() {
        System.out.println("HR Director managing the HR department");
    }
}

// Hierarchical Inheritance
// Making use of Developer and MarketingManager

// Hybrid Inheritance
class MarketingManager extends Employee {
    public MarketingManager(String empName, int empId) {
        super(empName, empId);
    }

    public void createMarketingStrategy() {
        System.out.println("Marketing Manager creating a marketing strategy");
    }
}

interface SalesManager {
    void boostSales();
}

class BusinessDevelopmentManager extends MarketingManager implements SalesManager {
    public BusinessDevelopmentManager(String empName, int empId) {
        super(empName, empId);
    }

    public void coordinateBusinessDevelopment() {
        createMarketingStrategy();
        boostSales();
        System.out.println("Business Development Manager coordinating business development efforts");
    }

    public void boostSales() {
        System.out.println("Sales Manager boosting sales");
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {
        // Single Inheritance
        // Developer dev1 = new Developer("Gauri", 108, "Java");
        // dev1.show();

        // Multiple Inheritance
        // TechLead techLead = new TechLead("Anna", 202, "Project X", 5);
        // techLead.displayInfo();

        // Multi-level Inheritance
        // HRDirector hrDirector = new HRDirector("Lucy", 313);
        // hrDirector.handleHRDuties();
        // hrDirector.manageHRDepartment();

        // Hierarchical Inheritance
        // Developer dev2 = new Developer("Charlie", 103, "Python");
        // MarketingManager M = new MarketingManager("Natasha", 253);
        // dev2.show();
        // M.createMarketingStrategy();

        // Hybrid Inheritance
        BusinessDevelopmentManager bdManager = new BusinessDevelopmentManager("Winston", 666);
        bdManager.coordinateBusinessDevelopment();
    }
}