import jdk.jfr.Experimental;
import java.util.Scanner ;


public class Main {
    static  void myMethod(String name, int age ) {
        System.out.println("Welcome: " + name + " - "+  + age);
    }

    static int switchMy() {
        int day =8;
        switch (day) {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            default:
                System.out.println("Nie ma takiego dnia");
        }
        return day;
    }

    static String name() {
        String [] arr = {"Olek", "Dawid", "Ferdynand"};
        return arr[1] ;
    }

    static int petlaWhile() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        return i;
    }



    static int petlaDoWhile() {

        int k = 0;

        do {
            System.out.println(k);
            k++;
        }
        while (k < 12);

        return k;
    }


    static int petlaFor() {
        int j;
        for(j=2; j <=50 ; j= j+2) {
            System.out.println(j);
        }
        return j;
    }

    static int petlaZakres() {
        int f;
        for(f=0; f<=30; f++) {

                if(f%3==0 && f%5 ==0) {
                    System.out.println("Pif Paf");
                }
                else if(f%3==0) {
                    System.out.println("Pif");
                }
                else if(f%5==0) {
                    System.out.println("Paf");
                }

                else {
                    System.out.println("Puf");
                }
            }

        return f;
    }

    static int sumaLiczb() {
        int s, a, suma;
        suma =0;
        for(s =0 ; s<=22; s = s+4) {
            suma = suma+s;
        }
        System.out.println(suma);

        return suma;

    }

    static int iloczyn() {
        int rez=1;
        for(int h = 50; h>=0; h = h-3) {
            if(h%5 ==0 || h<10) {
                rez = rez * h;
            }
        }
        System.out.println(rez);
        return rez;
    }

    static int pifPaf() {
       int f =0;
        while(f <=30) {
            if(f%3==0 && f%5 ==0) {
                System.out.println("Pif Paf");
            }
            else if(f%3==0) {
                System.out.println("Pif");
            }
            else if(f%5==0) {
                System.out.println("Paf");
            }

            else {
                System.out.println("Puf");
            }
            f++;
        }
        return f;


    }


    static int factorial() {
        int n =5, fac=1, j=1;
        while (j <= n) {
             fac = fac*j;
             j = j+1;
        }
        System.out.println(fac);
        return fac;
    }

    static void  asterics() {
//        System.out.println("* \n\t *");
        for(int i =10; i>=1 ; i--) {
            System.out.print("* \t");
        }
        System.out.println("\n");
        for(int i =9; i>=1 ; i--) {
            System.out.print("\t*");
        }

    }

    static void number() {
        String [] cars = {"BMW, FORD, OPEL"};
        for(int k=0; k<cars.length; k++) {
            System.out.println(cars[k]);
            System.out.println(cars.length);

        }

    }



    public static void main(String[] args) {
        Student studen3 = new Student("Dawid", "Podsiadło");
        System.out.println("Student: "+ studen3.getFirstname() + " " + studen3.getLastname());

//        petlaDoWhile();
//        petlaFor();
//        petlaZakres();




    }

}
