package thuchanh2;

public class Main {
    public static void main(String[] args) {
        //  khởi tạo đối tượng từ các lớp con
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "white");
        // Truy cập các phương của lớp cha như set/get
        System.out.println("Car1" + car1);
        System.out.println("Car 1 brand is "+ car1.getBrand());
        System.out.println("Car 1 color is "+ car1.getColor());
        car1.setColor(" yellow");
        car1.setBrand(" Honda");
        System.out.println("Car1new "+ car1);

        // hiển thị thông tin xe ô tô
        System.out.println(car1);
        System.out.println(car2);

        // hiẻn thị thông tin của xe máy
       Motorcycle motor1 = new Motorcycle("Honda", "red-white");
       Motorcycle motor2 =new Motorcycle("Vinfast","blue");
       // Hien thi thon tin cua xe may
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());

    }
}
