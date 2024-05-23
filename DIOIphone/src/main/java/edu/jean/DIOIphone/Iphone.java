/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jean.DIOIphone;
import edu.jean.DIOIphone.aplicativos.ipod.Ipod;
import edu.jean.DIOIphone.aplicativos.NavegadorDeInternet;
import edu.jean.DIOIphone.aplicativos.Telefone;
/**
 *
 * @author jean_
 */
public class Iphone {
    private int tamanho =1200;
    private boolean orientacao = true;
    public Ipod ipod = new Ipod();
    public NavegadorDeInternet navegador = new NavegadorDeInternet();
    public Telefone telefone = new Telefone();
    
    public void MudarOrientacao( ){
        orientacao = orientacao != true;
        tamanho = orientacao == true ? 1200 : 600; 
    }
}
