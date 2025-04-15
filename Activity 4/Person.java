//package Activity 4;

public class Person {

    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public class SchoolTest{
        public static void main(String[] args){

            System.out.println("School Management Information\n");

            System.out.print("Student Information: \n");
            Student student = new Student("Jean Valenzuela", 1232025, "1st Year");
            student.displayInfo();
            System.out.print("\n");

            System.out.print("Teacher Information: \n");
            Teacher teacher = new Teacher("Rheeze Zara", 2025507, "Programming");
            teacher.displayInfo();
            System.out.print("\n");

            System.out.print("Staff Information: \n");
            Staff staff = new Staff("Dazelyn Aguirre", 2025762, "Accounting");
            staff.displayInfo();
            System.out.print("\n");

        }
    }

    

}
