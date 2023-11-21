
class Driver {
	private Vehicle v;

	public Driver(Vehicle v) {
		this.v = v;
	}

	public void setVehicle(Vehicle v) {
		this.v = v;
	}

	public void run() {
		this.v.go();
	}
}
