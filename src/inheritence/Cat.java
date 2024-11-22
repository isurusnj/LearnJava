package inheritence;

public class Cat extends Pet{
    {
        System.out.println("this is a cat");
    }
    public Cat(String name, int age, boolean eat, boolean groom) {
        super(name, age, eat, groom);
    }

    public String getName(){
        return "The cat name is "+super.getName();
    }



}
