package baitap2;

import static java.lang.Math.PI;

public class Circle {
    private double R;

    public Circle() {
    }

    public Circle(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public double tinhDienTich(){
        return R*R*PI;
    }
    public double tinhChuVi(){
        return 2*3.14*R;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R= " + R + " Dien tich: "+ tinhDienTich() + " Chu vi: " + tinhChuVi() +
                '}';
    }
}
