package io.github.toronto22.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target USERNAME_INPUT = Target.
            the("Username input").locatedBy("#user-name");
    public static final Target PASSWORD_INPUT = Target.
            the("Password input").locatedBy("#password");

    public static final Target LOGIN_BUTTON = Target.
            the("Login button").locatedBy("#login-button");
}
