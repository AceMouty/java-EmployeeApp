package employeeApp;

public class Employee {

  /*
    class are seutp with....
      fields come first, after that are geters and seters, and then all other methods
  */

  // fields
  private static int maxId = 0;
  private int id;
  private String firstName;
  private String lastName;
  private double salary;
  private boolean has401K;
  private int companyId;
  private int healthPlanId;


  /* 
    ============================================
    constructor: initial state on the object
    ============================================
    
    1. default return type of the constructor is void
    2. you know its a constructor bc it will share the same name ass
        the class that it belongs to.
  */
  public Employee(String firstName, String lastName, double salary, boolean has401K, int companyId, int healthPlanId) {
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.has401K = has401K;
    this.companyId = companyId;
    this.healthPlanId = healthPlanId;

  }


  // =====================
  // getters and setters
  // =====================

  // First Name
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    // attr        value / param passed
    this.firstName = firstName;
  }

  // Last Name
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;

  }

  // Salary
  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  // 401K
  public void set401K(boolean has401K) {
    this.has401K = has401K;
  }

  public boolean get401K() {
    return has401K;
  }

  // Company Id
  public void setCompanyId(int companyId) {
    this.companyId = companyId;
  }

  public int getCompanyId() {
    return companyId;
  }

  // Health Plan Id
  public void setHealthPlanId(int healthPlanId) {
    this.healthPlanId = healthPlanId;
  }

  public int getHealthPlanId() {
    return healthPlanId;
  }

  // =====================
  // methods
  // =====================

  public String getName(){
    return firstName + " " + lastName;
  }

  // Object -> Employee
  @Override
  public String toString() {

    String rtnString = "id: " + id + "\n" +
                       "firstName" + firstName + "\n" +
                       "lastName" + lastName + "\n" +
                       "salary" + salary + "\n" +
                       "has401K" + has401K + "\n" +
                       "companyId" + companyId + "\n" +
                       "healthPlanId" + healthPlanId + "\n";
    return rtnString;
  }
}