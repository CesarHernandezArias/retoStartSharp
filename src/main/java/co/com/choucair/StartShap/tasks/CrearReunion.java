package co.com.choucair.StartShap.tasks;

import co.com.choucair.StartShap.model.Datos;
import static co.com.choucair.StartShap.userinterface.Reunion.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class CrearReunion implements Task {

    private List<Datos> data;

    public CrearReunion(List<Datos> data) {
        this.data = data;
    }

    public static CrearReunion deNegocio(List<Datos> data) {
        return Tasks.instrumented(CrearReunion.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LIST_MEETING), Click.on(MEETINGS),
                Click.on(NEW_MEETING), Enter.theValue(data.get(0).getNameMeet()).into(MEETING_NAME),
                Click.on(UNIT),
                Enter.theValue(data.get(0).getNameUnit()).into(UNIT_FOUND).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(SAVE), Click.on(ID), Click.on(ID));
    }
}
