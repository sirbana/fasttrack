package AnimalRescuelab12;

public class Animal {
    private String name;
    private float age;
    private int health;
    private int hunger;
    private int spirit;
    private Food favouriteFood;
    private Activity activity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public Food getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(Food favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void talk() {
        System.out.println("Animal talks!");
    }
}
