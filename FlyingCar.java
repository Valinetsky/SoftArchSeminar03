public class FlyingCar extends Car {

	public FlyingCar(String mark, String model, String color, String exter, Fuel_Type fuel_type, Gearbox_Type gearbox,
			int num_wheels, double vol_eng) {
		super(mark, model, color, exter, fuel_type, gearbox, num_wheels, vol_eng);
		this.fuel_type = Fuel_Type.ATOMIC;

	}

	@Override
	protected String movement() {
		return "flight";
	}

}
