package chess;

import java.util.Scanner;

/*
Git lifecycle:
1. добавить файл в гит (пометить глазами что это типа мусор)
2. коммит (отнести добавленные файлы в локальный репозиторий, то есть в свою мусорку)
3. пуш (отнести все закомиченные файлы в удаленный репозиторий, то есть на свалку)


ДЗ:
1. добавить ладью (если хотите добавьте слона)
2. добавить ферзя (прочитайте про дженерики (generics или типизированные типы))
 */
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
