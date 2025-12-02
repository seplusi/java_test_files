
public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int get_range() {
        return mpg*fuelcap;
    }

    void print_range() {
        System.out.println("This vehicle's range is " + get_range());
    }

    double fuelNeeded(int miles) {
        return (double) miles/mpg;
    }

    int getPassengers() { return passengers; }
    int getFuelcap() { return fuelcap; }
    int getMpg() { return mpg; }
}
