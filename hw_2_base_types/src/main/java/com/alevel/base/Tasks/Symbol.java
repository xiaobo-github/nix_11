package com.alevel.base.Tasks;

public class Symbol implements Comparable<Symbol> {

    char character;
    int count;

    public Symbol(char character){
        this.character = character;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public char getCharacter() {
        return character;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "" + character +
                " - " + count +
                "\n";
    }

    @Override
    public int compareTo(Symbol check) {
        return (check.count - this.count);
    }
}
