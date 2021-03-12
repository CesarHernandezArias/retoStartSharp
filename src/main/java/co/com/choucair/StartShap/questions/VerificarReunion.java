package co.com.choucair.StartShap.questions;

import co.com.choucair.StartShap.model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.StartShap.userinterface.Reunion.*;

public class VerificarReunion implements Question<Boolean> {
    private List<Datos> data;

    public VerificarReunion(List<Datos> data) {
        this.data = data;
    }

    public static VerificarReunion igualA(List<Datos> data) {
        return new VerificarReunion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(TEXT_MEET).viewedBy(actor).asString().equals(data.get(0).getNameMeet());
    }
}
