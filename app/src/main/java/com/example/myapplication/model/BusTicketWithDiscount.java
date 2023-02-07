package com.example.myapplication.model;

public class BusTicketWithDiscount extends BusTicket{
    // задание полей
    private float ticketDiscount; // скидка на билет

    // создание пустого конструктора
    public BusTicketWithDiscount() {
    }
    // создание конструктора исходных данных билета со скидкой (стоимость билета, количество билетов, скидка)
    public BusTicketWithDiscount(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // переопределение метода подсчёта стоимости билетов со скидкой
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }

}
