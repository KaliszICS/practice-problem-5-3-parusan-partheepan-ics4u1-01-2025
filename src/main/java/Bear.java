public class Bear extends Animal {
    
    public Bear(String name, int age, String type, int position) {
        super(name, age, type, position);  // Call Animal constructor
    }
    
    @Override
    public String animalSound() {
        return "Roar";
    }
    
    @Override
    public void move() {
        position += 1;
    }
}