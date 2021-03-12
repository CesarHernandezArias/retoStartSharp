package co.com.choucair.StartShap.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reunion {
    public static final Target LIST_MEETING = Target.the("Desplegable Reuniones").
            located(By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/a"));
    public static final Target MEETINGS = Target.the("Reuniones").
            located(By.xpath("/html/body/div[2]/aside[1]/section/div/ul/li[5]/ul/li[1]/a"));
    public static final Target NEW_MEETING = Target.the("Crear nueva reunion").
            located(By.xpath("/html/body/div[2]/div[1]/section/div/div[2]/div[2]/div/div/div[1]"));
    public static final Target MEETING_NAME = Target.the("Nombre de la reunión").
            located(By.id("StartSharp_Meeting_MeetingDialog14_MeetingName"));
    public static final Target UNIT = Target.the("Abrir desplegable").
            located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[7]/div[1]/a"));
    public static final Target UNIT_FOUND = Target.the("Buscar unidad creada").
            located(By.xpath("/html/body/div[7]/div/input"));
    public static final Target SAVE = Target.the("Guardar reunion").
            located(By.xpath("/html/body/div[2]/div[1]/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]"));
    public static final Target TEXT_MEET = Target.the("Texto de verificacion reunion").
            located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[4]/div[3]/div/div[1]/div[2]/a"));
    public static final Target ID = Target.the("ID").
            located(By.xpath("/html/body/div[2]/div[1]/section/div/div[3]/div[2]/div/div/div[1]"));
}
