package thuahanh1;

public class Main {
    public static void main(String[] args) {

        //Tao cac doi tuong tu cac class
        Animal animal1 = new Animal("Pig");
         Dog dog1 = new Dog("Becgie", "black");
         Dog dog2 = new Dog("Pug", "White");
         Cat cat = new Cat("Dora");

         // dùng các phương thức get/set truy cập và thay đổi thuộc tính
        System.out.println("animal's name is "+ animal1.getName());
        animal1.setName("Bird");
        System.out.println("animal1's name is " + animal1.getName());

        // truy cập phương thức được kế thừa từ lớp cha
        dog1.setName("Corgi");
        System.out.println("Name1 : "+dog1.getName());
        System.out.println("Sound : "+ dog1.makeSound());
        System.out.println("Color : "+ dog1.getColor());
        System.out.println("Name2 : "+ dog2.getName());
        System.out.println("Color : "+ dog2.getColor());
        System.out.println("Sound : "+ dog2.makeSound());
        System.out.println("Name : "+ cat.getName());
        System.out.println("Sound : "+ cat.makeSound());
    }
}
