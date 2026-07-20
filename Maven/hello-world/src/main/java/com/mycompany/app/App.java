package com.mycompany.app;

public class App{
public static void main(String[]args){
String appName = System.getProperty("app.name");
String appVersion = System.getProperty("app.version");
System.out.println("AppName:" + appName);
System.out.println("AppVersion:" + appVersion);
}
}