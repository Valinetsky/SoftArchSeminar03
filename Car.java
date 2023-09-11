//методы: движение, обслуживание, переключение передач, включение фар дворников.

public abstract class Car implements iCar {
	protected String mark, model, color, exter;
	private Fuel_Type fuel_type;
	private Gearbox_Type gearbox;
	protected int num_wheels;
	protected double vol_eng;

	private boolean light_on = false;

	/**
	 * @param mark       - марка производителя (Toyota, Москвич, …)
	 * @param model      - модель авто в модельном ряду производителя
	 * @param color      - цвет кузова
	 * @param exter      - тип кузова
	 * @param fuel_type  - вид топлива
	 * @param gearbox    - тип коробки передач
	 * @param num_wheels - число колес
	 * @param vol_eng    - объем двигателя
	 */
	public Car(String mark, String model, String color, String exter, String fuel_type, String gearbox, int num_wheels,
			double vol_eng) {
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.exter = exter;
		this.fuel_type = fuel_type;
		this.gearbox = gearbox;
		this.num_wheels = num_wheels;
		this.vol_eng = vol_eng;
	}

	protected String movement() {
		return "";
	}

	protected String service() {
		return "";
	}

	public void changeGearbox(String gearbox_mode) {
	}

	@Override
	public boolean isSweepingStreet(boolean isSweeping) {
		return false;
	}

	@Override
	public boolean turnLights(boolean is_light) {
		is_light = !is_light;
		return is_light;
	}

}
