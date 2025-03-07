package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testCashbackHackService900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(result, 100, "Ожидаемый остаток для 900: 100");
    }

    @Test
    public void testCashbackHackService1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(result, 1000, "Ожидаемый остаток для 1000: 1000");
    }
    @Test
    public void testCashbackHackService1100() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1100);
        Assert.assertEquals(result, 900, "Ожидаемый остаток для 1100: 900");
    }


}

