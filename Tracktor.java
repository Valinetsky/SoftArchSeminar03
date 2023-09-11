public class Tracktor extends StreetCleaningCar implements iFuelStation {

	public Tracktor(String model, String color, String exter, Fuel_Type fuel_type, Gearbox_Type gearbox, int num_wheels,
			double vol_eng) {
		super("Toyota", model, color, exter, fuel_type, gearbox, num_wheels, vol_eng);
		this.cleaning_on = true;
	}

	public 

	@Override
	public void fuel_type() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fuel_type'");
	}
}

// Создать конкретный автомобиль путём наследования класса «Car», определить
// метод «движение» - «полёт». Провести проверку принципа LSP.
// 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
// 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс
// «Car».
// 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового
// стекла, протирка фар, протирка зеркал.
// 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный
// класс «Car». Провести проверку принципа ISP. Создать дополнительный/е
// интерфейсы и имплементировать их в конкретный класс «Car». Провести проверку
// принципа ISP.
// 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и
// дизельным двигателями, имплементировать метод «Заправка топливом» интерфейса
// «Заправочная станция». Реализовать заправку каждого автомобиля подходящим
// топливом. Провести проверку принципа DIP.
