package co.com.choucair.StartShap.tasks;

import co.com.choucair.StartShap.model.Datos;
import static co.com.choucair.StartShap.userinterface.Acceso.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class IniciarSesion implements Task {

    private List<Datos> data;

    public IniciarSesion(List<Datos> data) {
        this.data = data;
    }

    public static IniciarSesion enLaPagina(List<Datos> data) {
        return Tasks.instrumented(IniciarSesion.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getUsername()).into(USERNAME),
                Enter.theValue(data.get(0).getPassword()).into(PASSWORD),
                Click.on(SIGN_IN));
    }
}
