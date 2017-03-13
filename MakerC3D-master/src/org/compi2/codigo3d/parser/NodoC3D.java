package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String EtqV = "";
    private String EtqF = "";

    public String getEtqV() {
        return EtqV;
    }

    public void setEtqV(String EtqV) {
        this.EtqV = EtqV;
    }

    public String getEtqF() {
        return EtqF;
    }

    public void setEtqF(String EtqF) {
        this.EtqF = EtqF;
    }
    

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
        
}
