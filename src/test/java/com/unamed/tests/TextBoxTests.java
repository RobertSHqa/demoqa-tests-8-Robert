package com.unamed.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {


        open("https://demoqa.com/automation-practice-form") ;
        $("#firstName").setValue("Robert");
        $("#lastName").setValue("Shvarc");
        $("#userEmail").setValue("unaved@gmail.com");
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").setValue("89017805607");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("2002");
        $(".react-datepicker__day--008:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("Screenshot_3.png");
        $("#currentAddress").setValue("street moon 12");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();
        $("#closeLargeModal").click();
  //      submit
     //   closeLargeModal
    }
}