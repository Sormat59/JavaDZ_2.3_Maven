import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndBonusUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int price = 1000_60;
        boolean registered = true;
        int expected = 30;

        // вызываем целевой метод:
        int actual = service.calculate(price, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndBonusOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int price = 1_000_000_60;
        boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(price, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndBonusUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int price = 1000_60;
        boolean registered = false;
        int expected = 10;

        // вызываем целевой метод:
        int actual = service.calculate(price, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndBonusOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int price = 1_000_000_60;
        boolean registered = false;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(price, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}