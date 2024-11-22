package inheritence;

public class Dog extends Pet{
    {
        System.out.println("This is Dog");
    }

    public Dog(String name, int age, boolean eat, boolean groom) {
        super(name, age, eat, groom);
    }
    @Override
    public String petCanPlay(){
        return "Dog like to sleep";
    }

    public String getName(){
        return "The Dog name is "+super.getName();
    }

}
