package exercise;

import io.javalin.Javalin;
import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        List<String> phones = Data.getPhones();
        app.get("/phones", ctx -> {
            List<String> phone = Data.getPhones();
            ctx.json(phone);
        });
        app.get("/domains", ctx -> {
            List<String> domains = Data.getDomains();
            ctx.json(domains); 
        });
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
