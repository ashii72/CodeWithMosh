package com.ashkan.types;

public class EscapeSequences {

    // c:\Windows\...
    String message1 = "Hello \"Ashkan\"";
    String message2 = "c:\\Windows\\...";
    String message3 = "c:\nWindows\\...";
    String message4 = "c:\tWindows\\...";

    public String escapeChar() {
        return message1;
    }

    public String driveEscapeChar() {
        return message2;
    }

    public String newLineEscapeChar() {
        return message3;
    }

    public String tabEscapeChar() {
        return message4;
    }
}


