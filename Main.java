
public class Main {
	public static void main(String[] args) {
		Vehicle v = new Car();
		Driver d = new Driver(v);
		d.run();
		d.setVehicle(new Bike());
		d.run();
	}
}
