package org.ranapat.simpledependencyinjecting;

public class ToBeInjectedWithParameters {
    private final String parameter;

    public ToBeInjectedWithParameters(final String parameter) {
        this.parameter = parameter;
    }

    public String getMessage() {
        return "value to be returned " + parameter;
    }
}
