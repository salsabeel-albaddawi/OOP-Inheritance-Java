
package human;


public class Test {

    public static void main(String[] args) {
        
        
        Human h = new Human("Ataa",20);
        System.out.println(h);
        
        Assistant a = new Assistant();
        a.setAge(25);
        a.setName("Ataa");
        a.setSalary(1000);
        System.out.println(a); 
        
        Guide m = new Guide("IT",3000,"Kamal",30);
        System.out.println(m); 
        
    }
    
}
