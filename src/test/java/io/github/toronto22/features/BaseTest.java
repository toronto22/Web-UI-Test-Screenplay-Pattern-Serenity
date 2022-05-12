package io.github.toronto22.features;

import net.serenitybdd.junit5.SerenityTest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

@SerenityTest
public class BaseTest {
    @Managed
    WebDriver toronto22Driver;

    Actor toronto22 = new Actor("Toronto22");

    @BeforeEach
    public void startApplication(List<> people){

    }
}
