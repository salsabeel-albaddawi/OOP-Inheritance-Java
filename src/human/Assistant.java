package human;


public class Assistant extends Human {
        private int salary;

    public Assistant() {
    }

    public Assistant(int salary) {
        this.salary = salary;
    }

    public Assistant(int salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Assistant{" + "name=" + getName() + ", age=" + getAge() + ", salary=" + salary + '}';
    
    
}
}