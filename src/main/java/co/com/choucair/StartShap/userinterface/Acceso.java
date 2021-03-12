package co.com.choucair.StartShap.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Acceso {
    public static final Target USERNAME = Target.the("Nombre de usuario").
            located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target PASSWORD = Target.the("Clave de acceso").
            located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target SIGN_IN = Target.the("Boton de inicio").
            located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
