# Simple Dependency Injecting

Simple way to implement dependency injection. It's using [Instance Factory](https://github.com/ranapat/instancefactory)

It has a bit more to write, but much less magic and annotations to mess things up.

## Requirements
* Java 8
* Android SDK
* Gradle

## Building
Build tool is gradle

### Assemble
Run `./gradlew assemble`

### Run unit tests
Run `./gradlew test`

### Run lint
Run `./gradlew lint`

### Run jacoco tests
Run `./gradlew test`

### Explanation

Creation

```java
public class MainViewModel extends ViewModel {
    // instance
    private final ToBeInjected toBeInjected;
    // instance
    private final ToBeInjectedWithParameters toBeInjectedWithParameters;

    // constructor that receives all to be injected
    public MainViewModel(
            final ToBeInjected toBeInjected,
            final ToBeInjectedWithParameters toBeInjectedWithParameters
    ) {
        this.toBeInjected = toBeInjected;
        this.toBeInjectedWithParameters = toBeInjectedWithParameters;
    }

    // default constructor that calls the one above
    public MainViewModel() {
        this(
                InstanceFactory.get(ToBeInjected.class),
                InstanceFactory.get(ToBeInjectedWithParameters.class, new Class[]{String.class}, new Object[]{"predefined"})
        );
    }

}
```

Consumption

```java
// call the default constructor
final MainViewModel mainViewModel = new MainViewModel();
```