package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    public void testCashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(result, 100, "Ожидаемый остаток для 900: 100");
    }
}

