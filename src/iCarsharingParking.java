/**
 * интерфейс каршарингового сервиса
 */
public interface iCarsharingParking {

    /**
     * метод отображения количества доступных машин
     */
    void getAvailableCarsNumber();

    /**
     * метод отображения количества свободных мест
     */
    void getAvailableFreeSpacesNumber();

    /**
     * метод отображения VIN номера автомобиля находящемся на определенном парковочном месте
     *
     * @param placeNumber номер парковочного места
     */

    void getCarVinByPlaceNumber(int placeNumber);

    /**
     * метод взятия в аренду автомобиля
     *
     * @return объект автомобиль в аренду
     */
    Car rentCar();

    /**
     * метод возврата автомобиля в паркинг
     *
     * @param car объект возвращаемый автомобиль
     */

    void returnCar(Car car);
}
