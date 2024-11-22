package inheritence;

public class Tiger extends Animal{
    private boolean walk;
    {
        System.out.println("This is Tiger");
    }

    public Tiger(String name, int age, boolean eat, boolean walk) {
        super(name, age, eat);
        this.walk = walk;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }
    @Override
    public String getName(){
        return "Tiger Name is " + super.getName();
    }



}

