package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad, l;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    public NodoC3D(String cad, String l) {
        this.cad = cad;
        this.l = l;
    }
    public String getCad(){
        return cad;
    }
      
    public String getL(){
        return l;
    }
}
