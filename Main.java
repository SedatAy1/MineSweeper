
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int numRows = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int numCols = scanner.nextInt();

        MineSweeper game = new MineSweeper(numRows, numCols);
        game.initializeGame();
        game.playGame();

        scanner.close();
    }
}