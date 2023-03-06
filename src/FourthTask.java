public class FourthTask {
    public static void outTwo(int numberOne, int numberTwo) {
        System.out.println(numberOne + "\n" + numberTwo);
    }
    public static void preTwo(int numberOne, int numberTwo) {
        System.out.println(-numberOne + "\n" + -numberTwo);
    }
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 3;

        //Első alkalommal semmi változtatás nem történik, kiírja az eredeti értékeket.
        outTwo(numberOne, numberTwo);
        //Itt fogja a 2 értéket, lemásolja, és azzal kezd valamit, kiírja a negatív értéküket.
        preTwo(numberOne, numberTwo);
        //Végül kiírja újra az alap változóinkat változatlanul. 
        outTwo(numberOne, numberTwo);
        /*
         * Azért történik, mivel nem a fent megadott változókkal dolgozik a függvény, hanem saját lokális változói lesznek a paraméterként megadottak.
         * Csak a referenciaval dolgozunk
         */
    }
}
