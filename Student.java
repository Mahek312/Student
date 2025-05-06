public class Student{
    String name;
    int id;
    int age;
    public Student(String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age :" +age);

    }
    public static void main(String[] args){
       Student s1 = new Student("mahek", 345, 20);
        s1.displayInfo();
    }
}