package co.com.choucair.StartShap.tasks;

import co.com.choucair.StartShap.model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.StartShap.userinterface.UnidadDeNegocio.*;
import java.util.List;

public class CrearUnidad implements Task {

    private List<Datos> data;

    public CrearUnidad(List<Datos> data) {
        this.data = data;
    }

    public static CrearUnidad deNegocios(List<Datos> data) {
        return Tasks.instrumented(CrearUnidad.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORGANIZATION),
                Click.on(BUSINESS_UNITS),
                Click.on(NEW_BUSINESS_UNIT),
                Enter.theValue(data.get(0).getNameUnit()).into(NAME_UNIT),
                Click.on(SAVE),
                Click.on(ID),Click.on(ID));
    }
}
