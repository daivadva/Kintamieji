
public class Main {
    public static void main(String[] args) {
        //1       //   Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir šiuos metus (nebūtinai tikrus). Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir pavardės kintamuosius atspausdintų tokį sakinį :
        //"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".

        String vardas = "Daiva";
        String pavarde = "Dvarijone";
        int gimimometai = 1987;
        int dabartis = 2023;

        int metai = (int) (dabartis - gimimometai);

        System.out.println("Aš esu " + vardas + " " + pavarde + "." + " " + "Man yra " + metai + " " + "metai" + ".");

//2     Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.
        int min = 0;
        int max = 4;
        int rndNum2 = min + (int) (Math.random() * (max - min));
        int rndNum3 = min + (int) (Math.random() * (max - min));
        System.out.println(rndNum2);
        System.out.println(rndNum3);

        if (rndNum2 != 0 && rndNum3 != 0) {
            if (rndNum2 > rndNum3) {
                System.out.println(Math.round((double) rndNum2 / rndNum3 * 100) / 100.0);
            }
            if (rndNum2 < rndNum3) {
                System.out.println(Math.round((double) rndNum3 / rndNum2 * 100) / 100.0);
            }
            if (rndNum2 == rndNum3) {
                System.out.println("Skaičiai vienodi");
            }
        }

//3     Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        int min1 = 0;
        int max1 = 25;
        int rndNum4 = min1 + (int) (Math.random() * (max1 - min1));
        int rndNum5 = min1 + (int) (Math.random() * (max1 - min1));
        int rndNum6 = min1 + (int) (Math.random() * (max1 - min1));


        System.out.println(rndNum4);
        System.out.println(rndNum5);
        System.out.println(rndNum6);


        if ((rndNum4 <= rndNum5 && rndNum5 <= rndNum6) || (rndNum6 <= rndNum5 && rndNum5 <= rndNum4)) {
            System.out.println(rndNum5);
        } else if ((rndNum5 <= rndNum4 && rndNum4 <= rndNum6) || (rndNum6 <= rndNum4 && rndNum4 <= rndNum5)) {
            System.out.println(rndNum4);
        } else {
            System.out.println(rndNum6);
        }
        System.out.println("..................");


        // 4 Įvedami skaičiai -a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite ​Math.random()​ funkcija nuo 1 iki 10). Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.

        int min4 = 0;
        int max4 = 10;
        int a = min4 + (int) Math.round(Math.random() * (max4 - min4));
        int b = min4 + (int) Math.round(Math.random() * (max4 - min4));
        int c = min4 + (int) Math.round(Math.random() * (max4 - min4));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        System.out.println("................");

//5     Sukurkite keturis kintamuosius ir ​Math.random()​ funkcija sugeneruokite jiems
//reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).

        int min5 = 0;
        int max5 = 2;
        int rndNum51 = min5 + (int) Math.round(Math.random() * (max5 - min5));
        int rndNum52 = min5 + (int) Math.round(Math.random() * (max5 - min5));
        int rndNum53 = min5 + (int) Math.round(Math.random() * (max5 - min5));
        int rndNum54 = min5 + (int) Math.round(Math.random() * (max5 - min5));
        System.out.println(rndNum51);
        System.out.println(rndNum52);
        System.out.println(rndNum53);
        System.out.println(rndNum54);

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        if (rndNum51 == 0) {
            zeros++;
        }
        if (rndNum52 == 0) {
            zeros++;
        }
        if (rndNum53 == 0) {
            zeros++;
        }
        if (rndNum54 == 0) {
            zeros++;
        }
        if (rndNum51 == 1) {
            ones++;
        }
        if (rndNum52 == 1) {
            ones++;
        }
        if (rndNum53 == 1) {
            ones++;
        }
        if (rndNum54 == 1) {
            ones++;
        }
        if (rndNum51 == 2) {
            twos++;
        }
        if (rndNum52 == 2) {
            twos++;
        }
        if (rndNum53 == 2) {
            twos++;
        }
        if (rndNum54 == 2) {
            twos++;
        }

        System.out.println("Numbers 0" + " " + zeros);
        System.out.println("Numbers 1" + " " + ones);
        System.out.println("Numbers 2" + " " + twos);

        System.out.println("...............");

        //6 Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10. Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.

        int min6 = -10;
        int max6 = 10;
        int rndNum61 = min6 + (int) Math.round(Math.random() * (max6 - min6));
        int rndNum62 = min6 + (int) Math.round(Math.random() * (max6 - min6));
        int rndNum63 = min6 + (int) Math.round(Math.random() * (max6 - min6));

        if (rndNum61 < 0) {
            System.out.println("[" + rndNum61 + "]");
        }
        if (rndNum62 < 0) {
            System.out.println("[" + rndNum62 + "]");
        }
        if (rndNum63 < 0) {
            System.out.println("[" + rndNum63 + "]");
        }
        if (rndNum61 > 0) {
            System.out.println("{" + rndNum61 + "}");
        }
        if (rndNum62 > 0) {
            System.out.println("{" + rndNum62 + "}");
        }
        if (rndNum63 > 0) {
            System.out.println("{" + rndNum63 + "}");
        }
        if (rndNum61 == 0) {
            System.out.println("(" + rndNum61 + ")");
        }
        if (rndNum62 == 0) {
            System.out.println("(" + rndNum62 + ")");
        }
        if (rndNum63 == 0) {
            System.out.println("(" + rndNum63 + ")");
        }

        System.out.println("...................");

        //7 Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000 vienetų- 4 % nuolaida. Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama. Žvakių kiekį generuokite ​Math.random()​ funkcija nuo 5 iki 3000.

        int min7 = 5;
        int max7 = 3000;
        int rndNum71 = min7 + (int) (Math.random() * (max7 - min7));
        System.out.println(rndNum71);

        if (rndNum71 < 1000) {
            System.out.println(rndNum71 * 1);
        }
        if (rndNum71 >= 1000 && rndNum71 < 2000) {
            System.out.println(rndNum71 - (rndNum71 / 100.0 * 3));
        }
        if (rndNum71 >= 2000) {
            System.out.println(rndNum71 - (rndNum71 / 100.0 * 4));
        }

        System.out.println("..................");

//8     Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100. Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10 arba didesnės nei 90. Abu vidurkius atspausdinkite. Rezultatus =apvalinkite iki sveiko skaičiaus.

        int min8 = 0;
        int max8 = 100;
        int rndNum81 = min8 + (int) Math.round(Math.random() * (max8 - min8));
        int rndNum82 = min8 + (int) Math.round(Math.random() * (max8 - min8));
        int rndNum83 = min8 + (int) Math.round(Math.random() * (max8 - min8));
        System.out.println(rndNum81);
        System.out.println(rndNum82);
        System.out.println(rndNum83);

        System.out.println((rndNum81 + rndNum82 + rndNum83) / 3.0);

        int averageCount = 0;
        double sum = 0;

        if (rndNum81 >= 10 && rndNum81 <= 90) {
            averageCount++;
            sum += rndNum81;
            ;
        }
        if (rndNum82 >= 10 && rndNum82 <= 90) {
            averageCount++;
            sum += rndNum82;
        }
        if (rndNum83 >= 10 && rndNum83 <= 90) {
            averageCount++;
            sum += rndNum83;
        }
        if (averageCount == 0) {
            System.out.println("Numbers excluded");
        }
        double average2 = sum / averageCount;// 73 / 3
        System.out.println("New average " + average2);


        System.out.println("..................");


////9   Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes. Valandom, minutėm ir sekundėm sugeneruoti panaudokite funkciją Math.random(). Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės. Skaičių pridėkite prie jau sugeneruoto laiko. Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų sekundžių skaičių.
        int min9 = 0;
        int max9 = 300;
        int hour = 23;
        int minute = 59;
        int seconds = 59;

        int rndHour = (int) Math.round(Math.random() * hour);
        int rndMinute = (int) Math.round(Math.random() * minute);
        int rndSeconds = (int) Math.round(Math.random() * seconds);

//        rndHour = 23;
//         rndMinute = 59;
////        int rndSeconds = 0;

        System.out.println("Test " + hour + "." + minute + "." + seconds + ".");
        System.out.println("Current time is " + rndHour + ":" + rndMinute + ":" + rndSeconds);


        int rndNum91 = min9 + (int) Math.round(Math.random() * (max9 - min9));
        System.out.println("Random seconds " + rndNum91);


        // s + rndNum91 = x; jei x > 59; x % 60 = liekana,   x / 60 = extra minutes.

        int x = rndSeconds + rndNum91;
        int FinalHour = 0;
        int FinalMinute = 0;
        int FinalSeconds = 0;
        int extraMinute = 0;
        int extraHour = 0;
        if (x > 59) {
            FinalSeconds = x % 60;
            System.out.println("Sum of seconds " + FinalSeconds);  // 175 % 60  175 - 60 = 115; 115 - 60 = 55;  175 / 60 = 2
            extraMinute = x / 60;
            System.out.println("Sum of extra minutes " + extraMinute);
        } else {
            FinalSeconds = x;
        }

        extraMinute = (x - FinalSeconds) / 60;
        int y = rndMinute + extraMinute;
        if (y > 59) {
            FinalMinute = y % 60;
            System.out.println("Sum of minutes " + FinalMinute);
            extraHour = y / 60;
            System.out.println("Sum of extra hour " + extraHour);
        } else {
            FinalMinute = y;
        }

        int z = rndHour + extraHour;
        if (z > 23) {
            FinalHour = z % 24;
            System.out.println("Sum of hours " + FinalHour);

        } else {
           FinalHour = z;
        }

        if (FinalHour < 10 || FinalMinute <10 || FinalSeconds <10) {
            System.out.println("New time " + "0" + FinalHour + "." + "0" + FinalMinute + "." + "0" + FinalSeconds);
        }
        else {
            System.out.println("New time " + FinalHour + "." + FinalMinute + "." + FinalSeconds);
        }


        //      x = (rndSeconds + rndNum91) % 60;

        


    }


}