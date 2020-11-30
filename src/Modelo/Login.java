/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author tavoGeek
 */
public class Login {
    
    private String usuario = "admin";
    private String password = "admin";
    
    public boolean accederSistema(String usuario, String password) {
        return usuario.equals(this.usuario) && password.equals(this.password);
    }
}
