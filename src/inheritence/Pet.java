package inheritence;

public class Pet extends Animal {
   private boolean groom;
   /* {
        System.out.println("This is a pet class");
    }*/

    public Pet(String name, int age, boolean eat, boolean groom) {
        super(name, age, eat);
        this.groom = groom;
    }

    public boolean isGroom() {
        return groom;
    }

    public void setGroom(boolean groom) {
        this.groom = groom;
    }

    public String petCanPlay() {
        return "pet can play";
    }
}
