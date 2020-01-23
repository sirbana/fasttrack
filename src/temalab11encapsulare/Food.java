package temalab11encapsulare;

public class Food {
    private String foodName;
    private Float price;
    private Float quantity;
    private boolean avaible;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }


    public boolean isAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }


}
