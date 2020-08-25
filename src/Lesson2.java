import java.math.BigDecimal;
import java.util.Scanner;


public class Lesson2 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //exercise1();
        //exercise2(4);
        //exercise3(2, 5);
        fibonacci(6);
        exercise5();
    }

    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        int[] arr = new int[10];
        // TODO loe sisse konsoolist 10 täisarvu
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            arr[i] = n;
        }
        // TODO trüki arvud välja vastupidises järiekorras
        int size = arr.length;
        for (int i = size-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        int n = scanner.nextInt();
        for (int i = 2; i<=n*2; i = i + 2) {
           System.out.println(i);
        }
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10
    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();

        }

        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
    }

    public static int fibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);

        if (n == 1) {
            System.out.println(fib[0]);
        } else if (n == 2) {
            System.out.println(fib[1]);
        } else {
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i-2] + fib[i-1];
            }
            System.out.println(fib[n-1]);
        }



        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element
        return 0;
    }

    public static void exercise5() {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
    }

    public static void exercise6() {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal(1.89);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");
    }

    public static void exercise8() {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
    }

    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
    }

}
