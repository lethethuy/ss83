package thuahanh1;

public class Animal {
    // tao thuoc tinh
    private String name;

    // tao contructor co tham so va khong co tham so


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // tao phuong thuc makeSound
    public String makeSound(){
        return "";

    }
}

