package edu.pe.cibertec;

import edu.pe.cibertec.beans.HolaMundo;
import edu.pe.cibertec.beans.Imprimible;
import edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecutora_Anotacion {
    public static void main(String[] args) {

        // Programando como indica SPRING
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HolaMundo holamundo = (HolaMundo) context.getBean("holamundoBean");
        holamundo.saludar();

        ImpresoraService impresoraService = (ImpresoraService) context.getBean("impresoraServiceBean");
        impresoraService.imprimirDocumento();

        ((ConfigurableApplicationContext) context).close();

    }
}