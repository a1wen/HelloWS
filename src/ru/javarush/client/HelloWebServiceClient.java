package ru.javarush.client;

import ru.javarush.ws.*;

/**
 * Created by a1wen on 18.03.17.
 */
public class HelloWebServiceClient {
    public static void main(String[] args){
        //подключаемся к тегу service в wsdl описании
        HelloWebServiceImplService helloService = new HelloWebServiceImplService();
        //получив информацию из тега service подключаемся к самому веб-сервису
        HelloWebService hello = helloService.getHelloWebServiceImplPort();

        //обращаемся к сервису и выводим результат в консоль
        System.out.println(hello.getHelloString("JavaRush Community!"));
    }
}
