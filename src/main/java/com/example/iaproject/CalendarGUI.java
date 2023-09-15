package com.example.iaproject;

import com.calendarfx.model.CalendarEvent;
import javafx.fxml.FXML;
import com.calendarfx.model.Calendar;
import com.calendarfx.model.CalendarSource;
import com.calendarfx.view.CalendarView;

public class CalendarGUI {
    @FXML
    private CalendarView calendarView;

    @FXML

    private void initialize() {
        CalendarSource cs = new CalendarSource("cs");
        calendarView.getCalendarSources().add(cs);
//TODO: Make calendar, add to valview and findEntries("")
        com.calendarfx.model.Calendar cal = new Calendar("cal");
        cal = cs.getCalendars().get(0);
        cal.findEntries("");

        calendarView.addEventHandler(CalendarEvent.ENTRY_CHANGED, e -> handleEvent(e));

    }

    private void handleEvent(Object e) {
        System.out.printf("Entry changed");
    }
}
