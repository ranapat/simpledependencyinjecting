package org.ranapat.simpledependencyinjecting;

import androidx.lifecycle.ViewModel;

import org.ranapat.instancefactory.InstanceFactory;

public class MainViewModel extends ViewModel {
    private final ToBeInjected toBeInjected;
    private final ToBeInjectedWithParameters toBeInjectedWithParameters;

    public MainViewModel(
            final ToBeInjected toBeInjected,
            final ToBeInjectedWithParameters toBeInjectedWithParameters
    ) {
        this.toBeInjected = toBeInjected;
        this.toBeInjectedWithParameters = toBeInjectedWithParameters;
    }

    public MainViewModel() {
        this(
                InstanceFactory.get(ToBeInjected.class),
                InstanceFactory.get(ToBeInjectedWithParameters.class, new Class[]{String.class}, new Object[]{"predefined"})
        );
    }

    public String getMessage1() {
        return toBeInjected.getMessage();
    }

    public String getMessage2() {
        return toBeInjectedWithParameters.getMessage();
    }
}
