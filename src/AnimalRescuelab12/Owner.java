package AnimalRescuelab12;

public class Owner extends Person {

    public void job() {
        System.out.println("many duties!");
    }

    private Float money;

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

}
