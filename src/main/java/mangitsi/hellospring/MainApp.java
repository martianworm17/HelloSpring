/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangitsi.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Giacomo Mariani
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        
        obj.getMessage();
    }
}
