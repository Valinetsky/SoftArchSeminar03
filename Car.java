//методы: движение, обслуживание, переключение передач, включение фар дворников.

public abstract class Car {private String mark, model, color, exter;
	private Fuel_Type fuel_type;
	private Gearbox_Type gearbox;
	private int num_wheels;
	private double vol_eng;

	private boolean light_on = false;
	private boolean wipers_on = false;

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
	public Car(
		String mark, 
		String model, 
		String color, 
		String exter, 
		Fuel_Type fuel_type, 
		Gearbox_Type gearbox,
		int num_wheels,
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
	
	// метод ДВИЖЕНИЕ
	protected String movement() {
		return "moving";
	}

	// метод ОБСЛУЖИВАНИЕ
	protected String service() {
		return "";
	}

	// метод ПЕРЕКЛЮЧЕНИЕ ПЕРЕДАЧ
	public void changeGearbox(String gearbox_mode) {
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ ФАР
	public boolean turnLights(boolean light_on) {
		light_on = !light_on;
		return light_on;
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ ДВОРНИКОВ
	public boolean turnWipers(boolean wipers_on) {
		wipers_on = !wipers_on;
		return wipers_on;
	}
}
