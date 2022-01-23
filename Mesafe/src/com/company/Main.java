package com.company;
//@owner Zelaxsus
//https://app.patika.dev/zelaxsus

        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double way, waypay;
        int age, journey;
        double genc;
        String gidisgelis = "Gidiş Geliş indirimi +";
        String pay = "İndirimli Ücret: ";
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz: ");
        way = inp.nextDouble();
        if (way <= 0) {
            System.out.println("Hatalı Veri Girdiniz! ");
        } else {
            System.out.print("Yaşınızı Giriniz: ");
            age = inp.nextInt();
            if (age <0)
            {
                System.out.println("Hatalı Veri Girdiniz");
            }
            else
            {
            System.out.print("Yolculuk Tipini Giriniz : 1 => TEK YÖN - 2 => GİDİŞ - GELİŞ: ");
            journey = inp.nextInt();
            if (!(journey == 1 || journey == 2)) {
                System.out.println("Hatalı Veri Girdiniz !");
            } else {
                waypay = way * 0.10;
                System.out.println("Ücret: " + waypay);
                if (age < 12) {
                    System.out.println("Çocuk İndirimi "+pay+(waypay / 2));
                }
                if (age > 12 && age < 24) {
                    genc = (waypay / 10);
                    double totalpay = waypay - genc;
                    System.out.println(pay + totalpay);
                    if (journey == 2) {
                        double journey20;
                        journey20 = waypay / 20;
                        System.out.println(gidisgelis + "" + pay + (totalpay - journey20));
                    }
                }
                if (age > 65) {
                    double oldpay = waypay / 30;
                    double totalpay = (waypay - oldpay);
                    System.out.println("Yaşlı İndirimi " + (totalpay));
                    if (journey == 2) {
                        double journey20;
                        journey20 = waypay / 20;
                        System.out.println(gidisgelis + "Yaşlı İndirimi" + (totalpay - journey20));
                    }

                }

            }
        }

    }
}}