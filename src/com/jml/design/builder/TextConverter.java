package com.jml.design.builder;

public abstract class TextConverter {

    abstract void convertCharacter(char c);
    abstract void convertParagrahp();
}

class ASCIIText {
    public void append(char c) {

    }
}

class ASCIIConverter extends TextConverter {

    ASCIIText asciiTextObj;

    @Override
    void convertCharacter(char c) {
        char asciiChar = new Character(c).charValue();
        asciiTextObj.append(asciiChar);
    }

    @Override
    void convertParagrahp() {

    }

    ASCIIText getResult() {
        return asciiTextObj;
    }
}

class Document {
    static int value;
    char token;
    public char getNextToken() {
        return token;
    }
}

class RTFReader {
    private static final char EOF = '0';
    final char CHAR = 'c';
    final char PARA = 'p';
    char t;
    TextConverter builder;

}