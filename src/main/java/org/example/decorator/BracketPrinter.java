package org.example.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BracketPrinter implements Printable {
    Printable printable;

    public BracketPrinter(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {

        System.out.print("(");
        printable.print();
        System.out.print(")");

    }

    @Override
    public void exapmpleMethod() {
        log.info("do noting");
    }
}
