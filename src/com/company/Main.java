package com.company;

public class Main {

    public static void main(String[] args) {
        var estacion = "";
        switch (estacion){
            case "invierno":
                System.out.println("la estacion en la que estas es invierno");
                break;
            case"verano":
                System.out.println("la estacion en la que estas es verano");
                break;
            case"otoño":System.out.println("la estacion en la que estas es otoño");
                break;
            default:
                System.out.println("no estas en ninguna estacion");
            }
        }
    }

