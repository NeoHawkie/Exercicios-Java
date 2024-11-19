/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.interfacegrafica;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Wallyson M. de Lima
 */
public class ControllerCriptografia {
    public static final String SHA256 = "SHA-256";
    public static final String MD5 = "MD5";
    
    protected String informacao, padrao;

    public String getInformacao() {
        return informacao;
    }

    public void setInformcao(String informacao) {
        this.informacao = informacao;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public ControllerCriptografia(String informcao, String padrao) {
        this.informacao = informacao;
        this.padrao = padrao;
    }
    
    public String criptografar(){
        String informacao = getInformacao(); //busca a informação a crioptografar
        MessageDigest messageDigest; //obj responsável por gerar a hash
        StringBuilder hexString = null; //StringBuilder é uma classe para construir Strings. pode ir sendo adicionado ao longo do uso.
        
        try{
            messageDigest = MessageDigest.getInstance(getPadrao());
            byte[] hash = messageDigest.digest(informacao.getBytes(StandardCharsets.UTF_8));
            hexString = new StringBuilder(2*hash.length);
            
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
        }catch(NoSuchAlgorithmException error){
            error.printStackTrace();
        }
        return hexString.toString().toUpperCase();
    }
}
