//Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
//Создать конкретный автомобиль путём наследования класса «Car».
// Расширить абстрактный класс «Car», добавить метод: подметать улицу. Создать конкретный автомобиль путём наследования класса «Car». Провести проверку принципа SRP.
// Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка груза. Провести проверку принципа OCP.
// Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3. Провести проверку принципа LSP.


public class Main {
    public static void main(String[] args) {

        Sedan myCar1 = new Sedan("Toyota", "Crown", "white", "universal", Fuel_Type.GASOLIN, Gearbox_Type.AT, 4, 2.0);

        StreetCleaningCar myCar2 = new StreetCleaningCar("Cat", "buldozer", "yellow", "box", Fuel_Type.DIESEL, Gearbox_Type.MT, 6, 12.7);

        // метем улицу
        myCar2.cleaning();
        // перестаем мести улицу
        myCar2.cleaning();

        System.out.println();


        CarFogFreight myCar3 = new CarFogFreight("MAZ", "Perestroika", "red", "trailler", Fuel_Type.DIESEL, Gearbox_Type.AT, 18, 40.0);

        // мигаем противотуманками, и транспарантом "ГРУЖЕНЫЙ"
        myCar3.fog();
        myCar3.freight();
        myCar3.freight();
        myCar3.fog();

        Sedan myCar4 = new Sedan("Toyota", "Crown", "white", "universal", Fuel_Type.GASOLIN, Gearbox_Type.AT, 3, 2.0);

        
        
        
        Tracktor myCar8 = new Tracktor("Camry", "blue", "sedan", Fuel_Type.GASOLIN, Gearbox_Type.AT, 4, 2.5);



        Tracktor myCar4 = new Tracktor("Camry", "blue", "sedan", Fuel_Type.DIESEL, Gearbox_Type.MT, 3, 2.5);
        
    }
}