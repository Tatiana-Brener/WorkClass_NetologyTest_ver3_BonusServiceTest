import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculate() {
        BonusService bonusService = new BonusService();

//        подготоваливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 300;

//        вызываем целевой метод:
        long actual = bonusService.calculate(amount, registered);

//        производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);


    }
}