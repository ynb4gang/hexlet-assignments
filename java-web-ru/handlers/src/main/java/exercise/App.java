package exercise;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        app.get("/phones", ctx -> {
            List<String> phones = Data.getPhones();
            ctx.json(phones);
        });
        app.get("/domains", ctx -> {
            List<String> domains = Data.getDomains();
            ctx.json(domains); 
        })
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
