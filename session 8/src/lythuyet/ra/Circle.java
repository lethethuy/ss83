package lythuyet.ra;

public class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int soCanh, double chuVi, double dienTich, double radius) {
        super(soCanh, chuVi, dienTich);
        this.radius = radius;
    }

    @Override
    public void tinhChuVi() {
      this.setChuVi(2*PI*radius);
    }

    @Override
    public void tinhDientTich() {
        this.setDienTich(PI*radius*radius);

    }

}
