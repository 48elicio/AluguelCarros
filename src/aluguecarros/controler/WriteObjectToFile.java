package aluguecarros.controler;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comp1
 */
public class WriteObjectToFile {
        public static void escrever(String usuario) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("user.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(usuario);
            objectOutputStream.flush();
            objectOutputStream.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
