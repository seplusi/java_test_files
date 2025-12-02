

public class main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        int dist = 252;
        double gallons;

        System.out.println("The minivan range is " + minivan.getFuelcap()*minivan.getMpg());
        System.out.println("The sportscar range is " + sportscar.getFuelcap()*sportscar.getMpg());
        minivan.print_range();
        sportscar.print_range();
        System.out.println("The minivan range is " + minivan.get_range());
        System.out.println("The sportscar range is " + sportscar.get_range());

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Minivan needs " + gallons + " to do " + dist + " and can hold " + minivan.getFuelcap());
        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Sportscar needs " + gallons + " to do " + dist + " and can hold " + sportscar.getFuelcap());
    }
}
