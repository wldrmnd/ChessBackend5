package chess;

import java.util.Scanner;

public class Application {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введи начальные координаты коня: ");
        Position startPos = new Position(in.next());

        Knight knight = new Knight(startPos);

        System.out.println("Введи начальные координаты коня: ");
        Position endPos = new Position(in.next());

        System.out.println(knight.makeTurn(endPos));
    }
}
