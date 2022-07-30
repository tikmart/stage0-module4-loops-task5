package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {

        int i,j;
        if (sideLength % 2 != 0) {
            for (i = 0; i < sideLength; i++) {

                for (j = 0; j < sideLength; j++) {
                    if ((i ==(int) sideLength / 2) || (j == (int) sideLength / 2)) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }

                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printCross(5);
        printCross(3);
        printCross(0);
    }
}
