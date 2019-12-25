package temalab11encapsulare;

public class Appmain11 {
    public static void main(String[] args) {
        Animal caine = new Animal();
        caine.setName("Novac");
        caine.setAge(3.9f);
        System.out.println(caine.getName() + "is " + caine.getAge() + "years old.");

        Owner O = new Owner();
        O.setName("Ana");
        O.setMoney(45.0f);
        System.out.println(O.getName() + " is the owner of " + caine.getName() + ".");

        Animal healthy = new Animal();
        healthy.setHealth(5);
        System.out.println(caine.getName() + " " + "is this healthy: " + healthy.getHealth());

        Animal hunger = new Animal();
        hunger.setHunger(7);
        System.out.println(caine.getName() + " is that much hungry: " + hunger.getHunger());

        Food protein = new Food();
        protein.foodName = "bone";
        protein.avaible = true;
        protein.price = 2.3f;
        System.out.println(caine.getName() + "`s" + " favourite food is " + protein.foodName);

        Activity night = new Activity();
        night.activityName = "sleep";
        System.out.println("After ten o`clock " + caine.getName() + " favourite activity is to " + night.activityName);

        Doctor x = new Doctor();
        x.doctorName = "Radu";
        System.out.println("He loves his doctor" + x.doctorName);


    }
}
