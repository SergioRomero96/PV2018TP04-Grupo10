/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.GestorNumeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class GestorNumerosFormBean implements Serializable{
    private GestorNumeros gestorNumeros;
    /**
     * Creates a new instance of GestorNumerosFormBean
     */
    public GestorNumerosFormBean() {
        gestorNumeros = new GestorNumeros();
    }

    /**
     * @return the gestorNumeros
     */
    public GestorNumeros getGestorNumeros() {
        return gestorNumeros;
    }

    /**
     * @param gestorNumeros the gestorNumeros to set
     */
    public void setGestorNumeros(GestorNumeros gestorNumeros) {
        this.gestorNumeros = gestorNumeros;
    }
    
    
}
