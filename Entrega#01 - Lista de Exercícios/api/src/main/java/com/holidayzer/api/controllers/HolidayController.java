package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.classes.HolidayCalendar;

@RestController
@RequestMapping("/")
public class HolidayController {
    HolidayCalendar c1 = new HolidayCalendar();

    @GetMapping
    public void getHoliday() {
        c1.imprimirListaFeriados();
    }

    @GetMapping("/{data}")
    public String getHoliday(@PathVariable String data) {
        String message = c1.verificarFeriado(data);

        return message;
    }
}
