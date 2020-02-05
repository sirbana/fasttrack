package AnimalRescuelab12;

public class Appmain12 {
    public static void main(String[] args) {
        Dog caine = new Dog();
        caine.setName("Novac");
        caine.setAge(3.9f);
        System.out.println(caine.getName() + "is " + caine.getAge() + "years old.");
        caine.talk();

        Duck ducky = new Duck();
        ducky.talk();

        Cat Paty = new Persian();
        Paty.talk();
        Paty.eat();

        Cat Mog = new Shorthair();
        Mog.sleep();

        Duck ducklings = new Ducklings();
        ducklings.talk();
        Owner kiddo = new OwnerKid();
        kiddo.job();

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
        protein.setFoodName("bone");
        protein.setAvailable(true);
        protein.setPrice(2.3f);
        System.out.println(caine.getName() + "`s" + " favourite food is " + protein.getFoodName());

        Activity night = new Activity();
        night.setActivityName("sleep");
        System.out.println("After ten o`clock " + caine.getName() + " favourite activity is to " + night.getActivityName());

        Doctor x = new Doctor();
        x.setName("Radu");
        System.out.println("He loves his doctor " + x.getName());

        x.setSpecialist("intern");
        System.out.println(x.getName() + " is an " + x.getSpecialist() + ".");

        Cat y = new Cat();
        y.talk();
    }
}
