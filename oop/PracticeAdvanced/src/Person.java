public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Getter & Setter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else{
            this.age = 0;
        }
    }
}
