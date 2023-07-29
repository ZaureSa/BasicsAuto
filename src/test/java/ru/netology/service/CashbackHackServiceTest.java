package ru.netology.service;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainCashback () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemainCashback1 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }
}



