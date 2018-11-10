/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewRfc;
import models.ModelRfc;
import controllers.ControllerRfc;
/**
 *
 * @author morenita
 */
public class Main {
    private static ViewRfc viewRfc;
    private static ModelRfc modelRfc;
    private static ControllerRfc controllerRfc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        viewRfc = new ViewRfc();
        modelRfc = new ModelRfc();
        controllerRfc = new ControllerRfc(viewRfc, modelRfc);
    }
    
}
