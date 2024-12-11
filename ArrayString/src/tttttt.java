class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed =breed;
    }
    public String getBreed(){
        return breed;
    }
}
public class tttttt {
    public static void main(String[] args) {
        Dog dog =new Dog("ddd","ffff");
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
    }
}
