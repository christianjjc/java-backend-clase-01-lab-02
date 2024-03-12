package edu.pe.cibertec;


import edu.pe.cibertec.beans.DocumentoExcel;
import edu.pe.cibertec.beans.DocumentoTexto;
import edu.pe.cibertec.beans.HolaMundo;
import edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HolaMundo holamundoBean(){
        return new HolaMundo();
    }

    @Bean
    public  DocumentoExcel documentoExcelBean(){
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoTextoBean(){
        return new DocumentoTexto();
    }


    @Bean
    public ImpresoraService impresoraServiceBean (){
        return new ImpresoraService();
    }


}
