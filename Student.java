class Student {
    // private attributes
    private String name;
    private int age;

    // getter methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Swati");
        s1.setAge(23);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}

