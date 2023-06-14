public class BeerSong2 {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bootles";

        if (beerNum == 1) {
            while (beerNum > 0) {
                word = "bootle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum -1;

            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else if (beerNum == 1) {
                System.out.println(beerNum + " bootle of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } //end else
            System.out.println("");
        } // end while
    } // end main method
} // end class
