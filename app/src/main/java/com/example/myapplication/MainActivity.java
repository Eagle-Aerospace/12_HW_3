package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.model.BusTicket;
import com.example.myapplication.model.BusTicketWithDiscount;

public class MainActivity extends AppCompatActivity {

    // создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    BusTicket busTicket = new BusTicket(70, 9);
    // создание объекта сущности детских билетов (стоимость билета, количество билетов, скидка)
    BusTicket busTicketChild = new BusTicketWithDiscount(70, 11, 50);
    // создание объекта сущности билетов для пенсионеров (стоимость билета, количество билетов, скидка)
    BusTicket busTicketPensioner = new BusTicketWithDiscount(70, 5, 30);

    // создание полей для вывода на экран нужных значений
    private TextView busTicketOut; // поле вывода общей стоимости взрослых билетов
    private TextView busTicketChildOut; // поле вывода общей стоимости детских билетов
    private TextView busTicketPensionerOut; // поле вывода общей стоимости билетов для пенсионеров
    private TextView busTicketTotalOut; // поле вывода общей стоимости всех билетов

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваивание переменным активити элементов представления activity_main
        busTicketOut = findViewById(R.id.busTicketOut); // вывод информации стоимости всех взрослых билетов
        busTicketChildOut = findViewById(R.id.busTicketChildOut); // вывод информации стоимости всех детских билетов
        busTicketPensionerOut = findViewById(R.id.busTicketPensionerOut); // вывод информации стоимости всех детских билетов
        busTicketTotalOut = findViewById(R.id.busTicketTotalOut); // вывод информации стоимости всех билетов

        // запонение экрана
        // 1) заполнение первого поля воспоьзовавшись методом подсчёта стоимости взрослых билетов ticketPriceAll()
        // С помощью метода Float.toString() мы конвертировали данные из типа float в String
        busTicketOut.setText(Float.toString(busTicket.ticketPriceAll()) + " монет");
        // 2) заполнение второго поля воспользовавшись переопределённым методом подсчёта стоимости детских билетов ticketPriceAll()
        busTicketChildOut.setText(Float.toString(busTicketChild.ticketPriceAll()) + " монет");
        // 3) заполнение третьего поля воспользовавшись переопределённым методом подсчёта стоимости билетов для пенсионеров ticketPriceAll()
        busTicketPensionerOut.setText(Float.toString(busTicketPensioner.ticketPriceAll()) + " монет");
        // 4) заполнение четвертого поля стоимостью всех билетов
        busTicketTotalOut.setText(Float.toString(busTicket.ticketPriceAll() + busTicketChild.ticketPriceAll()
                + busTicketPensioner.ticketPriceAll()) + " монет");

    }
}