package activities;

public class WeightConvertor {
     public static double poundstoKG(float w){
        System.out.println("Weight in pounds: " + w);
        double kg = w/2.2;
        System.out.println("Weight in Kilograms: " + kg);
        return kg;
    }

    public static void main(String[] args){
        double w1 = poundstoKG(186.2f);
        double w2 = poundstoKG(207.0f);
        double total = w1 + w2;
        System.out.println("total: " + total);
    }
}
