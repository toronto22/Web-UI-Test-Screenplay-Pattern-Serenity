package io.github.toronto22.tasks;

import io.github.toronto22.user_interface.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {
    public static Performable with(String username, String password) {
        return Task.where("Login into system with \nUsername: "
                        + username + "\nPassword: " + password,
                Enter.theValue(username).into(LoginUI.USERNAME_INPUT),
                Enter.theValue(password).into(LoginUI.PASSWORD_INPUT),
                Click.on(LoginUI.LOGIN_BUTTON)
        );
    }
}
