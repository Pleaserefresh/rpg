package com.pleaserefresh;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Reader
        Scanner read = new Scanner(System.in);

        //postać
        String name;
        String role;
        int str = 1;
        int dex = 1;
        int wis = 1;
        int cha = 1;
        int hp = 5;
        int mana = 3;
        int luck = -7;
        int ap = 1;
        int ad = 1;
        int range = 1;

        //Świat modyfikatory
        int weather;
        int unluck;

        //Wybór postaci
        System.out.println("Witaj w pierwszym RPG. \n" +
                "Zanim przejdziemy dalej stwór swoją postać.");
        System.out.println("Wybierz swoją klasę: (Wojownik/Mag/Łowca)");
        role = read.next();
        role = role.toLowerCase(Locale.ROOT);
        if (role.equals("wojownik")) {
            str += 5;
            dex += 3;
            wis += 1;
            cha += 1;
            hp += str * 2;
            mana += wis;
            luck += cha + dex;
            ad += str + dex;
            ap += wis + cha;
            System.out.println("Twoje statyskiki jako Wojownik wyglądają nstępująco:");
            System.out.println("Siła: " + str + "\n" +
                    "Zręczność: " + dex + "\n" +
                    "Wiedza: " + wis + "\n" +
                    "Charyzma: " + cha + "\n" +
                    "Życie: " + hp + "\n" +
                    "Mana: " + mana + "\n" +
                    "Szczęście: " + luck + "\n" +
                    "Obrażenia fizyczne: " + ad + "\n" +
                    "Obrażenia magiczne: " + ap + "\n" +
                    "Zasięg ataku: " + range);
        } else if (role.equals("mag")) {
            str += 1;
            dex += 1;
            wis += 5;
            cha += 3;
            hp += str;
            mana += wis;
            luck += cha + dex;
            ad += str + dex;
            ap += wis + cha;
            range += wis + dex;
            System.out.println("Twoje statyskiki jako Mag wyglądają nstępująco:");
            System.out.println("Siła: " + str + "\n" +
                    "Zręczność: " + dex + "\n" +
                    "Wiedza: " + wis + "\n" +
                    "Charyzma: " + cha + "\n" +
                    "Życie: " + hp + "\n" +
                    "Mana: " + mana + "\n" +
                    "Szczęście: " + luck + "\n" +
                    "Obrażenia fizyczne: " + ad + "\n" +
                    "Obrażenia magiczne: " + ap + "\n" +
                    "Zasięg ataku: " + range);
        } else {
            str += 1;
            dex += 5;
            wis += 1;
            cha += 3;
            hp += str * 3 / 2;
            mana += wis;
            luck += cha + dex;
            ad += str + dex;
            ap += wis + cha;
            range += wis + dex;
            System.out.println("Twoje statyskiki jako Łowca wyglądają nstępująco:");
            System.out.println("Siła: " + str + "\n" +
                    "Zręczność: " + dex + "\n" +
                    "Wiedza: " + wis + "\n" +
                    "Charyzma: " + cha + "\n" +
                    "Życie: " + hp + "\n" +
                    "Mana: " + mana + "\n" +
                    "Szczęście: " + luck + "\n" +
                    "Obrażenia fizyczne: " + ad + "\n" +
                    "Obrażenia magiczne: " + ap + "\n" +
                    "Zasięg ataku: " + range);
        }
        System.out.println("Wybierz imię dla swojej postaci:");
        name = read.next();
        System.out.println("Możemy zaczynać przygodę " + name + "!");

        // Pierwsza przygoda
        System.out.println("**Tura pierwsz - gracz**");
        System.out.println("Stoisz przed tawerną, jesteś przemoczony bo cały wieczór padał deszcz \n" +
                "Co chcesz zrobić? /a. wejść do środka/ /b. ruczyć dalej/");
    }
}
