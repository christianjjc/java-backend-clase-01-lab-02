package edu.pe.cibertec;

import edu.pe.cibertec.beans.HolaMundo;
import edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora_XML {
    public static void main(String[] args) {

        // Proramación Tradicional
        /**
        HolaMundo holamundo = new HolaMundo();
        holamundo.setNombre("Pepito Perez");
        holamundo.saludar();
        **/

        // Programando como indica SPRING
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HolaMundo holamundo = (HolaMundo) context.getBean("holaMundoBean");
        holamundo.saludar();

        ImpresoraService impresoraService = (ImpresoraService) context.getBean("impresoraServiceBean");
        impresoraService.imprimirDocumento();

        ((ConfigurableApplicationContext) context).close();

    }
}