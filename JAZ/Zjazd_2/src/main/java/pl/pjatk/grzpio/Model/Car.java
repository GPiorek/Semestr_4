package pl.pjatk.grzpio.Model;

import lombok.NoArgsConstructor;


public class Car {
    int mileage;
    String model;

    public Car(int mileage, String model) {
        this.mileage = mileage;
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
