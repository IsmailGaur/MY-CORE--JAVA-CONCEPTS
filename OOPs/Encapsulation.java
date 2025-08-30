class Student {
    private String name;
    private int age;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive! ");
        }
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        Student s = new Student();

        s.setName("ismail! ");
        s.setAge(22);
        System.out.println("Student name is " + s.getName());
        System.out.println("Student age is " + s.getAge());
    }

}
