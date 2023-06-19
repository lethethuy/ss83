package thuahanh1;

public class Dog extends Animal {
    // khoi tao thuoc tinh
    private String color;

    // khoi tao constructor co tham so va khong co tham so


    public Dog() {
    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Gau gau";
    }
}
