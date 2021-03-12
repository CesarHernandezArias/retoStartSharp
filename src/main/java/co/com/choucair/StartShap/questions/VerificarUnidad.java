package co.com.choucair.StartShap.questions;

import co.com.choucair.StartShap.model.Datos;
import static co.com.choucair.StartShap.userinterface.UnidadDeNegocio.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class VerificarUnidad implements Question<Boolean> {
    private List<Datos> data;

    public VerificarUnidad(List<Datos> data) {
        this.data = data;
    }

    public static VerificarUnidad igualA(List<Datos> data) {
        return new VerificarUnidad(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(TEXT).viewedBy(actor).asString().equals(data.get(0).getNameUnit());
    }
}
