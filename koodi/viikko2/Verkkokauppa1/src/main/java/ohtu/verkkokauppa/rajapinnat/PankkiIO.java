/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa.rajapinnat;

/**
 *
 * @author Tomi
 */
public interface PankkiIO {

    public boolean tilisiirto(String nimi, int viite, String tiliNumero, String kaupanTili, int summa);
    
}
