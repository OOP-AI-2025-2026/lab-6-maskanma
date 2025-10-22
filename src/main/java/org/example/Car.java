package org.example;

public class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) {
            throw new ClassCastException("Cannot compare Car with " + (o == null ? "null" : o.getClass()));
        }
        Car other = (Car) o;

        int byPrice = other.price - this.price;
        if (byPrice != 0) return byPrice;

        int byYear = this.year - other.year;
        if (byYear != 0) return byYear;

        return this.horsePower - other.horsePower;
    }
}
