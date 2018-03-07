/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Caixa {
    
    private int id;
    private boolean status;

    public Caixa(int id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
