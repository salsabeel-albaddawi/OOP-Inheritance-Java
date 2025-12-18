
package human;
public class Guide extends Assistant{
        private String department ;

    public Guide() {
    }

    public Guide(String department) {
        this.department = department;
    }

    public Guide(String department, int salary) {
        super(salary);
        this.department = department;
    }

    public Guide(String department, int salary, String name, int age) {
        super(salary, name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Guide{" + "name=" + getName() + ", age=" + getAge() + ", salary=" + getSalary() + ", department='" + department + "'}";

    }
        
   
}