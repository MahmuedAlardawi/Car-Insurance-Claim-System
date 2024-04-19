/*
Name: Mahmued Ahmed Alardawi
ID: 21352089
Section: ZJ
Course name: Programming II
Course code: CPCS 203
Assignment number: Assignment #2 (Car Insurance Claim System)
 */

public class Car {
    private String carPlateNo;
    private String carType;
    private String brand;
    private String carModel;
    private String carColor;
    private int builtYear;

    //

    public Car(String carPlateNo, String carType, String brand, String carModel, String carColor, int builtYear) {
        this.carPlateNo = carPlateNo;
        this.carType = carType;
        this.brand = brand;
        this.carModel = carModel;
        this.carColor = carColor;
        this.builtYear = builtYear;
    }

    //

    public String getCarPlateNo() {
        return carPlateNo;
    }

    public void setCarPlateNo(String carPlateNo) {
        this.carPlateNo = carPlateNo;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    //

    @Override
    public String toString() {
        return "Car{" +
                "carPlateNo='" + carPlateNo + '\'' +
                ", carType='" + carType + '\'' +
                ", brand='" + brand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }
}