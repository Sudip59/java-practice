
package employee;

public class Person {
    private String name;
    private String phoneNum;
    private String email;
    
    public Person(){
        this.name = "";
        this.phoneNum = "";
        this.email = "";
    }
    public Person(String n, String p, String e){
        this.name = n;
        this.phoneNum = p;
        this.email = e;
    }
    
    public void setName(String na){
        this.name = na;
    }
    public String getName(){
        return this.name;
    }
    
    public void setphoneNum(String ph){
        this.phoneNum = ph;
    }
    public String getphoneNum(){
        return this.phoneNum;
    }
    
    public void setEmail(String em){
        this.email = em;
    }
    public String getEmail(){
        return this.email;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" +
                "Phone: " + this.phoneNum + "\n" +
                "Email: " + this.email;
    }
    
}

//-----------------------------------------------------------------------------

package employee;

public class Employee extends Person{

       private int employeeNumber;
       
       public Employee(){
       super();
       this.employeeNumber = 0;
       }
       public Employee(String name, String phone,  String email, int employeeNum){
           super(name, phone, email);
           this.employeeNumber = employeeNum;
       }
       
       public void setEmployeeNum(int num){
           this.employeeNumber = num;
       }
       public int getEmpoyeeNum(){
           return this.employeeNumber;
       }
       @Override
       public String toString(){
          return super.toString() + "\n" +
                "Employee: " + this.employeeNumber;
       }
       
    public static void main(String[] args) {
        Person p1 = new Person("Sudip", "012-345-6789", "sudip@gmail.com");
        Person p2 = new Person("Professor", "123-987-6540", "Prof@gmail.com");
         Employee e1 = new Employee("Alice", "555-555-5555", "alice@example.com", 1001);
         Employee e2 = new Employee("Bob", "444-444-4444", "bob@example.com", 1002);

    Person[] people = new Person[4];

    people[0] = p1;
    people[1] = p2;
    people[2] = e1;  
    people[3] = e2;

    
    for (Person person : people) {
        System.out.println(person);
        System.out.println();
    }
    
}
}
