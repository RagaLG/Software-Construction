package session08;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String VIN;
    private static int car_count=0;

    public Car(String make, String model, int year, String color, String VIN){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.VIN = VIN;
        car_count++;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public String getVIN(){
        return this.VIN;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public static int getCar_count(){
        return car_count;
    }
    public String toString(){
        return "Car details- Model3: " + getModel() +
        ", Make: " + getMake() +
        ", Year: " + getYear() +
        ", Color: " + getColor() +
        ", VIN: " + getVIN();
    }
    public boolean equals(Object c){
        if(c instanceof Car){
            Car car = (Car) c;
            return car.VIN== this.VIN;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("Car count: " + getCar_count());
        Car car1 = new Car("Ford", "Escape", 2017, "Red", "1234ABCD5");
        System.out.println("Car count: " + getCar_count());
        Car car2 = new Car("Ford", "Escape", 2017, "Red", "1234ABCD5");
        System.out.println("Car count: " + getCar_count());
        Car car3 = car1;
        System.out.println("Car count: " + getCar_count());
        Car car4 = new Car("Ford", "Escape", 2017, "Red", "1786AGH8");
        System.out.println("Car count: " + getCar_count());
        Car car5 = new Car("Dodge", "Arrive", 2019, "Blue", "1436YHL9");
        System.out.println("Car count: " + getCar_count());
        System.out.println("car1: "+car1);
        System.out.println("car2: "+car2);
        System.out.println("car3: "+car3);
        System.out.println("car4: "+car4);
        System.out.println("car5: "+car5);
        System.out.println("car1==car2" + (car1==car2));
        System.out.println("car1==car3" + (car1==car3));

        System.out.println("car1 equals car2: " + (car1.equals(car2)));
        System.out.println("car1 equals car3: " + (car1.equals(car3)));
        System.out.println("car1 equals car4: " + (car1.equals(car4)));
    }
}