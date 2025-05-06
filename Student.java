public class Student{
    String name;
    int id;
    int age;
    String address;
    public Student(String name,int id,int age,String address){
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age :" +age);
         System.out.println("Student Address :" +address);

    }
    public static void main(String[] args){
       Student s1 = new Student("mahek", 345, 20, "gadag");
        s1.displayInfo();
    }
}