package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleServiciosLugarPage {
    public static Target TITULO_TRADUCTOR = Target.the("titulo traduccion alert").locatedBy("//h1[text()='Translation on']");
    public static Target CERRAR_TRADUCCION = Target.the("cerrar traduccion alert").locatedBy("//button[@aria-label='Close']");
    public static Target TITULO_SECCION_BOTON = Target.the("sección del boton más servicios").locatedBy("//h2[text()='{0}']");
    public static Target BOTON_TODOS_SERVICIOS = Target.the("boton ver todos los servicios").locatedBy("//div[@data-section-id='AMENITIES_DEFAULT']//button[contains(text(), 'servicios')]");
}
