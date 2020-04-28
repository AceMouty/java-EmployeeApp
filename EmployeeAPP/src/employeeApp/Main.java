package employeeApp;

public class Main {

  /*
    classes have...

    fields - informtion about the class
    methods - things that the class can do like setName, getAddress, calculateSqrt etc
  */

  // main is the entry point of the program, this is a MUST have
  public static void main(String[] args) {

    HealthPlan h1 = new HealthPlan("My Healthplan 1");
    HealthPlan h2 = new HealthPlan("My Healthplan 2");

    Company c1 = new Company("Company A", 100);
    Company c2 = new Company("Company B", 200_000);

    Employee emp1 = new Employee("Kyle", "Guerrero", 70000, true, c1.id, h1.getId());
    Employee emp2 = new Employee("Billy", "Joe", 30000, false, c1.id, h2.getId());

    System.out.println("**** QUERY DATA ****");
    System.out.println(emp1);
    System.out.println();
    System.out.println(c1.debt);
    c1.debt = -c1.debt;
    System.out.println(c1.debt);
    
    // ======= Data Manip ======= 
    System.out.println("*** Strings ***");
    String localstr;
    localstr = emp1.getFirstName() + " " + emp2.getLastName();
    System.out.println(localstr);
    String nowVowels = localstr.toLowerCase();

    System.out.println();
    System.out.println("*** Numbers ***");
    System.out.println("Original/5: " + c1.debt / 5);
    System.out.println("Original/7: " + c1.debt / 7);
    System.out.println("Origianl/7.0: " + c1.debt / 7.0);
    System.out.println("CASTED TO INT");
    System.out.println("Origianl/7.0: " + c1.debt / (int)7.0);

  }

}