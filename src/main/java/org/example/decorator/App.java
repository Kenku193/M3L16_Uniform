package org.example.decorator;

public class App {
    public static void main(String[] args) {

        Printable printable = new QuotesPrinter(new BracketPrinter(new QuotesPrinter(new QuotesPrinter(new TextPrinter("some text")))));
        printable.print();

    }
}
