/**
 * Класс автомобиля.
 */
class Car implements ICar {

    /**
     * Уникальный идентификатор автомобиля.
     */
    private final String vin;
    /**
     * Ходовая часть автомобиля.
     */
    private final IRunningGear runningGear;
    /**
     * Кузов автомобиля.
     */
    private final ICarBody carBody;
    /**
     * Номерной знак автомобиля.
     */
    private String licensePlate;

    /**
     * Конструктор автомобиля.
     *
     * @param vin         уникальный идентификатор создаваемого автомобиля
     * @param runningGear ходовая часть создаваемого автомобиля
     * @param carBody     кузов создаваемого автомобиля
     */
    public Car(String vin, IRunningGear runningGear, ICarBody carBody) {
        this.vin = vin;
        this.runningGear = runningGear;
        this.carBody = carBody;

        System.out.println("Собран автомобиль с VIN: " + vin);
    }

    /**
     * Метод открытия двери автомобиля.
     */
    @Override
    public void openDoor() {
        carBody.openDoor();
    }

    /**
     * Метод закрытия двери автомобиля.
     */
    @Override
    public void closeDoor() {
        carBody.closeDoor();
    }

    /**
     * Метод нажатия на педаль газа.
     */
    @Override
    public void pressGasPedal() {
        runningGear.accelerate();
    }

    /**
     * Метод нажатия на педаль тормоза.
     */
    @Override
    public void pressStopPedal() {
        runningGear.brake();
    }

    /**
     * Метод пополнения топлива.
     *
     * @param volume объем топлива на который мы хотим заправить автомобиль.
     */
    @Override
    public void fillUpFuel(int volume) {
        runningGear.fillUpFuel(volume);
    }

    /**
     * Метод получения VIN номера автомобиля.
     */
    @Override
    public void getVin() {
        System.out.println("VIN текущего автомобиля: " + vin);
    }

    /**
     * Метод получения регистрационного номера автомобиля.
     */
    @Override
    public void getLicensePlate() {
        System.out.println("Регистрационный номер автомобиля: " + licensePlate);
    }

    /**
     * Метод установки регистрационного номера автомобиля.
     *
     * @param licensePlate устанавливаемый регистрационный номер автомобиля
     *                     принимаемый в формате строки
     */
    @Override
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Метод получения текущей скорости автомобиля.
     */
    @Override
    public void getCurrentSpeed() {
        System.out.println("Спидометр показывает " + runningGear.getCurrentSpeed() + " км.ч.");
    }

    /**
     * Метод получения текущего объема топлива в автомобиле.
     */
    @Override
    public void getCurrentFuelVolume() {
        System.out.println("Уровень топлива на отметке " + runningGear.getCurrentFuelVolume() + " л.");
    }

    /**
     * метод getTankVolume возвращает значение объема созданного бензобака
     *
     * @return возвращает значение объема созданного бензобака
     */
    @Override
    public int getTankVolume() {
        return runningGear.getTankVolume();
    }
}
