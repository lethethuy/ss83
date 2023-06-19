package baitap2;

public class Cylinder extends Circle {
     private double h;

    public Cylinder() {
    }

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double dienTichToanPhan(){
        return super.tinhDienTich()*2 + super.tinhChuVi()*h;
    }
    public double theTich(){
     return super.tinhDienTich()*h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieu cao = " + h +
                ", dien tich day = "+ super.tinhDienTich() +
                ", chu vi day= "+ super.tinhChuVi() +
                ", dien tich toan phan " + this.dienTichToanPhan() +
                ", the tich " + this.theTich() +
                "} ";
    }
}
