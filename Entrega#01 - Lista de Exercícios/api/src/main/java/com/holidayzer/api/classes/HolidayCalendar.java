package com.holidayzer.api.classes;

import java.util.HashMap;

public class HolidayCalendar {
    private HashMap<String, Holiday> feriados;

    public HolidayCalendar() {
        feriados = new HashMap<>();
        inicializarFeriados();
    }

    private void inicializarFeriados() {
        // Adicione os feriados à lista
        adicionarFeriado("01-01-2024", "Confraternização Mundial");
        adicionarFeriado("12-02-2024", "Carnaval");
        adicionarFeriado("13-02-2024", "Carnaval");
        adicionarFeriado("29-03-2024", "Sexta-feira Santa");
        adicionarFeriado("21-04-2024", "Tiradentes");
        adicionarFeriado("01-05-2024", "Dia do Trabalho");
        adicionarFeriado("30-05-2024", "Corpus Christi");
        adicionarFeriado("07-09-2024", "Independência do Brasil");
        adicionarFeriado("12-10-2024", "Nossa Senhora Aparecida");
        adicionarFeriado("02-11-2024", "Finados");
        adicionarFeriado("15-11-2024", "Proclamação da República");
        adicionarFeriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra");
        adicionarFeriado("25-12-2024", "Natal");
    }

    private void adicionarFeriado(String data, String nome) {
        feriados.put(data, new Holiday(data, nome));
    }

    public void imprimirListaFeriados() {
        for (Holiday feriado : feriados.values()) {
            System.out.println(feriado.getData() + " => " + feriado.getNome());
        }
    }

    public String verificarFeriado(String dataInserida) {
        Holiday feriado = feriados.get(dataInserida);
        if (feriado != null) {
            return "Dia " + feriado.getData() + " é " + feriado.getNome() + "! :)";
        } else {
            return "Dia " + dataInserida + " não é feriado :(";
        }
    }
}
