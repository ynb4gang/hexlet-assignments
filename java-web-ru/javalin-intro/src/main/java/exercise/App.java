package exercise;

// BEGIN

// END

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> config.bundledPlugins.enableDevLogging()
        );
        app.get(("/welcome",) ctx.result("Hello World"));
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
