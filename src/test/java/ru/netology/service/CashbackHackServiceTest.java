package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn1000IfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500IfAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn50IfAmountIs950() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int expected = 50;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}