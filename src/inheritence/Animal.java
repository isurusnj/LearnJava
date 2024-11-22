package inheritence;

public class Animal {

    /*{
        System.out.println("This is Animal Class");
    }*/
    private String name;
    private int age;


    public Animal(String name, int age, boolean eat) {
        this.name = name;
        this.age = age;


    }

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
        this.age = age;
    }

    public void isEat() {
        System.out.println(name + " is consuming");
    }


}
