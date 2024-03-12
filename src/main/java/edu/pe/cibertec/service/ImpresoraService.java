package edu.pe.cibertec.service;
import edu.pe.cibertec.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ImpresoraService {

    @Autowired
    @Qualifier("documentoTextoBean")
    private Imprimible documento;

    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }

    public void imprimirDocumento(){
        System.out.println(this.documento.imprimir());
    }

}
