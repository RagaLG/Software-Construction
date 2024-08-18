package session07;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(){
        this.name = "Snoopy";
        this.age = 5;
        this.breed = "Dalmation";
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int age, String breed){
        this("Snow", 7);
        this.breed = breed;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void birthday(){
        this.age++;
        System.out.println("Happy Birthday," +  name + "! You turned " + age + " years old!");
    }
    public void breedSwap(String breed){
        this.breed = breed;
        System.out.println(this.name + "'s breed has been updated to " + this.breed);
    }
    public String toString(){
        return this.name + " is a " + this.breed + " and " + this.age + " years old!";
    }

    public static void main(String[] args){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Snooze", 2);
        Dog dog3 = new Dog("Teenny");
        Dog dog4 = new Dog("Snooze", 2, "Labrador");
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog3.name);
        System.out.println(dog3.age);
        System.out.println(dog4.name);
        System.out.println(dog4.age);
        System.out.println(dog4.breed);
        dog1.birthday();
        dog2.birthday();
        dog2.breedSwap("Shitzu");
        dog3.breedSwap("Pomeranian");
        dog3.setAge(7);
        System.out.println(dog1.getAge());
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }
}