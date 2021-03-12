package co.com.choucair.StartShap.stepdefinitions;

import co.com.choucair.StartShap.model.Datos;
import co.com.choucair.StartShap.questions.VerificarReunion;
import co.com.choucair.StartShap.questions.VerificarUnidad;
import co.com.choucair.StartShap.tasks.AbrirPagina;
import co.com.choucair.StartShap.tasks.CrearReunion;
import co.com.choucair.StartShap.tasks.CrearUnidad;
import co.com.choucair.StartShap.tasks.IniciarSesion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class startSharpStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^El usuario debe autenticarse en StartSharp$")
    public void elUsuarioDebeAutenticarseEnStartSharp(List<Datos> data) throws Exception{
        theActorCalled("Cesar").wasAbleTo(AbrirPagina.enLaPagina(), IniciarSesion.enLaPagina(data));
    }

    @Cuando("^se crea la unidad de negocios$")
    public void seCreaLaUnidadDeNegocios(List<Datos> data) throws Exception{
        theActorInTheSpotlight().attemptsTo(CrearUnidad.deNegocios(data));
    }

    @Entonces("^se verifica que la unidad se cree con exito$")
    public void seVerificaQueLaUnidadSeCreeConExito(List<Datos> data) throws Exception{
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarUnidad.igualA(data)));
    }

    @Cuando("^se programa la reunion de negocios$")
    public void seProgramaLaReunionDeNegocios(List<Datos> data) throws Exception{
        theActorInTheSpotlight().attemptsTo(CrearReunion.deNegocio(data));
    }

    @Entonces("^se verifica la creacion de la reunion$")
    public void seVerificaLaCreacionDeLaReunion(List<Datos> data) throws Exception{
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarReunion.igualA(data)));
    }

}
