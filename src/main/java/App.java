import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.Map;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "hero.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/squad_photos", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroesDetails", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String superpower = request.queryParams("superpower");
            String heroAge = request.queryParams("heroAge");
            model.put("superpower", superpower);
            model.put("heroAge", heroAge);
            return new ModelAndView(model, "heroesDetails.hbs");
        }, new HandlebarsTemplateEngine());

    }
}