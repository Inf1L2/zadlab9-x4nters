package pl.edu.ur.oopl9;

import java.util.*;

public class Main {
    private static void zadanie1(){
        Random random = new Random();
        Integer[] tabRandomInt = new Integer[100];
        int menuSelect;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<tabRandomInt.length; i++){
            tabRandomInt[i] = random.nextInt(100) + 1;
        }

        do{
            System.out.println("Lab9 > Menu > Zadanie 1 > Menu >");
            System.out.println(" [ 1 ] Wyswietl tablice");
            System.out.println(" [ 2 ] Posortuj tablice");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menuSelect = scanner.nextInt();

            switch(menuSelect){
                case 1: zadanie1list(tabRandomInt); break;
                case 2: zadanie1sort(tabRandomInt); break;
                case 0: break;
            }
        }while(menuSelect!=0);
    }

    private static void zadanie1list(Integer[] tabRandomInt){
        for(int i=0; i<tabRandomInt.length; i++){
            System.out.println(i+1 + ". element tablicy ma wartosc: " + tabRandomInt[i]);
        }
    }

    private static Integer[] zadanie1sort(Integer[] tabRandomInt){
        Arrays.sort(tabRandomInt);
        return tabRandomInt;
    }

    private static void zadanie2(){
        Random random = new Random();
        TreeSet<Integer> treesetInteger = new TreeSet<>();

        for(int i=0; i<100; i++){
            treesetInteger.add(random.nextInt(50)+1);
        }

        Iterator treeIt = treesetInteger.iterator();

        System.out.println("Zawartosc TreeSet:");
        while (treeIt.hasNext()) {
            Integer value = (Integer)treeIt.next();
            System.out.println("Value :" + value);
        }
    }

    private static void zadanie3() {
        int menuSelect;
        Scanner scanner = new Scanner(System.in);

        List<Samochod> cars = new ArrayList<Samochod>();
        cars.add(new Samochod("Seat", "Leon", 1.9, 220, 40000));
        cars.add(new Samochod("Fiat", "Punto", 1.2, 200, 16000));
        cars.add(new Samochod("Seat", "Ibiza", 1.6, 220, 25000));

        do {
            System.out.println("Lab9 > Menu > Zadanie 3 > Menu >");
            System.out.println(" [ 1 ] Wypisz liste");
            System.out.println(" [ 2 ] Dodaj samochod");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menuSelect = scanner.nextInt();

            switch (menuSelect){
                case 1: zadanie3list(cars); break;
                case 2: zadanie3add(cars); break;
                case 0: break;
            }
        }while(menuSelect!=0);
    }

    private static void zadanie3list(List<Samochod> cars){
        Iterator carsIt = cars.iterator();
        while (carsIt.hasNext()) {
            Samochod car = (Samochod)carsIt.next();
            System.out.println("Marka: " + car.getMarka() + ", Nazwa: " + car.getNazwa() + ", Pojemnosc silnika: " + car.getPojSilnika() + ", Max predkosc: " + car.getMaxPredkosc() + ", Cena: " + car.getCena());
        }
    }

    private static List<Samochod> zadanie3add(List<Samochod> cars){
        Scanner scanner = new Scanner(System.in);
        String marka;
        String nazwa;
        double pojSilnika;
        int maxPredkosc;
        double cena;

        System.out.println("Lab9 > Menu > Zadanie 3 > Menu > Dodaj samochod >");
        System.out.print(" Marka: ");
        marka = scanner.next();
        System.out.print(" Nazwa: ");
        nazwa = scanner.next();
        System.out.print(" Pojemnosc silnika: ");
        pojSilnika = scanner.nextDouble();
        System.out.print(" Max predkosc: ");
        maxPredkosc = scanner.nextInt();
        System.out.print(" Cena: ");
        cena = scanner.nextDouble();

        cars.add(new Samochod(marka, nazwa, pojSilnika, maxPredkosc, cena));
        System.out.println("Dodano samochod do listy");

        return cars;
    }

    private static void zadanie4(){
        int menuSelect;
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> dictionaryPolish = new HashMap<>();
            dictionaryPolish.put(1,"tak");
            dictionaryPolish.put(2,"nie");
            dictionaryPolish.put(3,"ja");
            dictionaryPolish.put(4,"ty");
            dictionaryPolish.put(5,"oni");
            dictionaryPolish.put(6,"miec");
            dictionaryPolish.put(7,"slowo");
            dictionaryPolish.put(8,"wszyscy");
            dictionaryPolish.put(9,"when");
            dictionaryPolish.put(10,"móc");
            dictionaryPolish.put(11,"jeden");
            dictionaryPolish.put(12,"dwa");
            dictionaryPolish.put(13,"trzy");
            dictionaryPolish.put(14,"cztery");
            dictionaryPolish.put(15,"pięć");
            dictionaryPolish.put(16,"sześć");
            dictionaryPolish.put(17,"siedem");
            dictionaryPolish.put(18,"osiem");
            dictionaryPolish.put(19,"dziewięć");
            dictionaryPolish.put(20,"dziesięć");

        Map<Integer, String> dictionaryEnglish = new HashMap<>();
            dictionaryEnglish.put(1,"yes");
            dictionaryEnglish.put(2,"no");
            dictionaryEnglish.put(3,"I");
            dictionaryEnglish.put(4,"you");
            dictionaryEnglish.put(5,"they");
            dictionaryEnglish.put(6,"have");
            dictionaryEnglish.put(7,"word");
            dictionaryEnglish.put(8,"all");
            dictionaryEnglish.put(9,"when");
            dictionaryEnglish.put(10,"can");
            dictionaryEnglish.put(11,"one");
            dictionaryEnglish.put(12,"two");
            dictionaryEnglish.put(13,"three");
            dictionaryEnglish.put(14,"four");
            dictionaryEnglish.put(15,"five");
            dictionaryEnglish.put(16,"six");
            dictionaryEnglish.put(17,"seven");
            dictionaryEnglish.put(18,"eight");
            dictionaryEnglish.put(19,"nine");
            dictionaryEnglish.put(10,"ten");

        System.out.println("Lab9 > Menu > Zadanie 4 >");
        System.out.println(" Dostepne slowa:");
        System.out.println("    Polski:");
        System.out.println("      - tak, nie, ja, ty, oni, mieć, słowo, wszyscy, móc, jeden, dwa, trzy, cztery, pięć, sześć, siedem, osiem, dziewięć, dziesięć");
        System.out.println("    Angielski:");
        System.out.println("      - yes, no, I, you, they, have, word, all, when, can, one, two, three, four, five, six, seven, eight, nine, ten");

        do {
            System.out.println("Lab9 > Menu > Zadanie 4 > Menu >");
            System.out.println(" [ 1 ] Tłumacz -> polski - angielski");
            System.out.println(" [ 2 ] Tłumacz -> angielski - polski");
            System.out.print("Menu > ");
            menuSelect = scanner.nextInt();

            switch(menuSelect){
                case 1: zadanie4polang(dictionaryPolish,dictionaryEnglish);
                case 2: zadanie4angpol(dictionaryEnglish,dictionaryPolish);
            }
        }while(menuSelect!=0);

    }

    private static void zadanie4polang(Map<Integer, String> dictionaryPolish, Map<Integer, String> dictionaryEnglish){
        String word;
        int wordKey;
        String translated;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tłumacz -> (\"koniec!\" - wyjscie)");

        do {
            System.out.print("Podaj slowo: ");
            word = scanner.next();

        }while(word!="koniec!");

    }

    private static void zadanie4angpol(Map<Integer, String> dictionaryEnglish, Map<Integer, String> dictionaryPolish){
        System.out.println("Tłumacz -> ");
    }

    public static void main(String[] args) {
        int menuSelect;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Lab9 > Menu >");
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 3 ] Zadanie 3");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 0 ] Zakoncz");
            System.out.print("Menu > ");
            menuSelect = scanner.nextInt();

            switch(menuSelect){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
                case 3: zadanie3(); break;
                case 4: zadanie4(); break;
                case 0: break;
            }
        }while(menuSelect!=0);
    }
}
