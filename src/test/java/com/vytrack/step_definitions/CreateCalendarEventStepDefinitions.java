package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;

public class CreateCalendarEventStepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        System.out.println("User clicks on create calendar event button");
        calendarEventsPage.clickToCreateCalendarEvent();
    }

    @Then("user enters {string} as a title")
    public void user_enters_as_a_title(String string) {
        System.out.println("User enters title: "+string);
        calendarEventsPage.enterCalendarEventTitle(string);
    }

    @Then("user enters {string} as description")
    public void user_enters_as_description(String string) {
        System.out.println("User enters description: " + string);
        calendarEventsPage.enterCalendarEventDescription(string);
    }

    @Then("user clicks on save and close button")
    public void user_clicks_on_save_and_close_button() {
        calendarEventsPage.clickOnSaveAndClose();
    }
}
