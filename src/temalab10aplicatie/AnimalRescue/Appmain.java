package temalab10aplicatie.AnimalRescue;

public class Appmain {
    public static void main(String[] args) {
        Animal Novac = new Animal();
        Novac.name = "Novac";
        Novac.age = 3.9f;
        System.out.println(Novac.name + "is " + Novac.age + "years old.");

        Owner O = new Owner();
        O.name = "Ana";
        O.money = 44.5f;
        System.out.println(O.name + " is the owner of " + Novac.name + ".");

        Food protein = new Food();
        protein.foodName = "bone";
        protein.avaible = true;
        protein.price = 2.3f;
        System.out.println(Novac.name + "`s" + " favourite food is " + protein.foodName);

        Activity night = new Activity();
        night.activityName = "sleep";
        System.out.println("After ten o`clock " + Novac.name + " favourite activity is to " + night.activityName);

        Doctor x = new Doctor();
        x.doctorName = "Radu";
        System.out.println("He loves his doctor" + x.doctorName);


    }
}
