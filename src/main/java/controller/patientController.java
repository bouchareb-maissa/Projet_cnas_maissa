/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author mac
 */
@Named(value = "patientController")
@SessionScoped
public class patientController implements Serializable {

    /**
     * Creates a new instance of patientController
     */
    public patientController() {
    }
    
}
