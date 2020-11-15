package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        Integer sayilar[] = new Integer[1000000];

        Instant start = Instant.now();
        long startTime = Instant.now().getNano();

        for (int i=0; i<1000000; i++){
            sayilar[i] = i+1;
        }

        Instant end = Instant.now();
        long estimated = (Instant.now().getNano() - startTime);
        Duration timeElapsed = Duration.between(start, end);

        System.out.println("Dizi Oluşturulma Süresi : "+  "milisaniye : "+ timeElapsed.toMillis() +" milisaniye");
        System.out.println("Dizi Oluşturulma Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");


        //TODO Ekleme işlemi

        start = Instant.now();
        startTime = Instant.now().getNano();

        for (int i = 999999 ; i>0 ;i--){
            sayilar[i] = sayilar[i-1];
        }
        //TODO alttaki işlemi neden yaptığını öğren anlayamadım. Bu işlemin javada karşılığı yok.
        //sayilar[0] = -1;
        end = Instant.now();
        estimated = (Instant.now().getNano() - startTime);
        timeElapsed = Duration.between(start, end);

        System.out.println("1. Eleman Ekleme Süresi : "+ "Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        System.out.println("1. Eleman Ekleme Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");


        //TODO Çıkarma işlemi

        start = Instant.now();
        startTime = Instant.now().getNano();

        for (int i = 0; i<(1000000-1); i++){
        sayilar[i] = sayilar[i+1];
        }
        //TODO alttaki işlemi neden yaptığını öğren anlayamadım. Bu işlemin javada karşılığı yok.
        //sayilar[0] = -1;
        end = Instant.now();
        estimated = (Instant.now().getNano() - startTime);
        timeElapsed = Duration.between(start, end);

        System.out.println("1. Eleman Çıkarma Süresi : "+ "Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        System.out.println("1. Eleman Çıkarma Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");


        //TODO Ortaya Ekleme işlemi
        //TODO Javada array 0'dan başladığı için herşeyden -1 çıkarıyoruz.
        start = Instant.now();
        startTime = Instant.now().getNano();

        for (int i = 999999; i>(sayilar.length/2-1); i--){
            sayilar[i] = sayilar[i-1];
        }
        //TODO alttaki işlemi neden yaptığını öğren anlayamadım. Bu işlemin javada karşılığı yok.
        //sayilar[sayilar.length/2-1] = -1;
        end = Instant.now();
        estimated = (Instant.now().getNano() - startTime);
        timeElapsed = Duration.between(start, end);

        System.out.println("Ortaya Ekleme Süresi : "+ "Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        System.out.println("Ortaya Ekleme Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");

        //TODO Ortadan Çıkarma işlemi
        //TODO Javada array 0'dan başladığı için herşeyden -1 çıkarıyoruz.
        start = Instant.now();
        startTime = Instant.now().getNano();

        for (int i = sayilar.length/2-1; i<(sayilar.length-1); i++){
            sayilar[i] = sayilar[i-1];
        }
        //TODO alttaki işlemi neden yaptığını öğren anlayamadım. Bu işlemin javada karşılığı yok.
        //sayilar[sayilar.length/2-1] = -1;
        end = Instant.now();
        estimated = (Instant.now().getNano() - startTime);
        timeElapsed = Duration.between(start, end);

        System.out.println("Ortadan Çıkarma Süresi : "+ "Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        System.out.println("Ortadan Çıkarma Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");

        //TODO Sona Ekleme işlemi
        start = Instant.now();
        startTime = Instant.now().getNano();
        sayilar = Arrays.copyOf(sayilar,1000001);
        end = Instant.now();
        estimated = (Instant.now().getNano() - startTime);
        timeElapsed = Duration.between(start, end);

        System.out.println("Sona ekleme Süresi : "+ "Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        System.out.println("Sona ekleme Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");

        //TODO Sondan Çıkarma işlemi
        start = Instant.now();
        startTime = Instant.now().getNano();
        sayilar = Arrays.copyOf(sayilar,999999);
        end = Instant.now();
        estimated = (Instant.now().getNano() - startTime);
        timeElapsed = Duration.between(start, end);

        System.out.println("Sondan Çıkarma Süresi : "+ "Time taken: "+ timeElapsed.toMillis() +" milliseconds");
        System.out.println("Sondan Çıkarma Süresi : "+  "nanosaniye : "+ estimated +" nanosaniye");


    }

}
