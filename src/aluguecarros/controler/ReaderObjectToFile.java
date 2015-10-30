package aluguecarros.controler;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willian
 */
public class ReaderObjectToFile {
    




public static String ler() {
        String usu = null;
        try {
            FileInputStream leitorArquivos = new FileInputStream("user.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(leitorArquivos);
            
            usu = (String) objectInputStream.readObject();
            
            leitorArquivos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return usu;
}
}
