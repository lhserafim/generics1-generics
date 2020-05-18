package application;

import services.PrintService;

import java.util.Scanner;

// benefícios do genérics
// Reuso (da classe PrintService)
// TypeSafety

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //PrintService ps = new PrintService();
        // Alteração para o genérics, garantindo o typeSafety
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        //int n = sc.nextInt();
        Integer n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("First: " + ps.first());
        sc.close();
    }
}
