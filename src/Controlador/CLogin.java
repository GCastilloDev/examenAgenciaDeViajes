/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Login;

/**
 *
 * @author tavoGeek
 *
 * PATRON SINGLETON
 * 
 */
public class CLogin {

    private String usuario;
    private String password;
    private static CLogin loginInstance = null;

    private CLogin(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static CLogin getInstance(String usuario, String password) {
        if (loginInstance == null) {
            loginInstance = new CLogin(usuario, password);
        }

        return loginInstance;
    }

    public boolean concederAcceso() {
        Login login = new Login();
        return login.accederSistema(this.usuario, this.password);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
