package co.com.choucair.StartShap.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UnidadDeNegocio {
    public static final Target ORGANIZATION = Target.the("Organizaciones").
            located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/a"));
    public static final Target BUSINESS_UNITS = Target.the("Unidades de Negocio").
            located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/ul/li[1]/a"));
    public static final Target NEW_BUSINESS_UNIT = Target.the("Crear nueva unidad de negocio").
            located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]"));
    public static final Target NAME_UNIT = Target.the("Nombre de unidad").
            located(By.name("Name"));
    public static final Target SAVE = Target.the("Guardar").
            located(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div/div[1]"));
    public static final Target ID = Target.the("Presionar ID").
            located(By.xpath("/html/body/div[2]/div[1]/section/div/div[3]/div[2]/div/div/div[1]"));
    public static final Target TEXT = Target.the("Texto de verificacion").
            located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[4]/div[3]/div/div[1]/div[2]/a"));
}
