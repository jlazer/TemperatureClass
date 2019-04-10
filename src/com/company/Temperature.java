package com.company;
public class Temperature {

    private double degrees;
    private char scale;

    // No parameter constructor
    public Temperature() {

        setDegreesAndScale(degrees,'c');

    }
    // One parameter constructor
    public Temperature(double degrees) {

        setDegreesAndScale(degrees,'c');

    }
    // Two parameter constructor
    public Temperature(double degrees, char scale) {

        setDegreesAndScale(degrees, scale);

    }
    // One parameter constructor
    public Temperature(char scale) {

        setDegreesAndScale(0, scale);
    }
    // Getter Methods
    public double getDegreesCelsius() {

        if (scale == 'c' || scale == 'C') {
            return degrees;
        } else {
            double degreesC = (degrees - 32) * 5 / 9;
            return degreesC;

        }
    }
    public double getDegreesFahrenheit() {

        if (scale == 'f' || scale == 'F') {
            return degrees;
        } else {
            double degreesF = (degrees * 9 / 5) + 32;
            return degreesF;
        }

    }
    // Setter methods
    public void setDegrees(double degrees) {

        this.degrees = degrees;

    }
    public void setScale(char scale) {

        if (scale == 'c' || scale == 'C' || scale == 'f' || scale == 'F') {
            this.scale = scale;
        } else {
            System.exit(0);
        }

    }
    public void setDegreesAndScale(double degrees, char scale) {

        setDegrees(degrees);
        setScale(scale);

    }
    public boolean equal(Temperature t) {

        if (this.getDegreesCelsius() == t.getDegreesCelsius()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean greater(Temperature t) {

        if (this.getDegreesCelsius() > t.getDegreesCelsius()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean smaller(Temperature t) {

        if (this.getDegreesCelsius() < t.getDegreesCelsius()){
            return true;
        } else {
            return false;
        }
    }

}
