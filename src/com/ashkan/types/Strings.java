package com.ashkan.types;

public class Strings {

    String message = "      Hello Ashkan" + "!!     ";

    public String getMessage() {
        return message;
    }

    public boolean checkMessageEndWith() {
        return message.endsWith("!!");
    }

    public boolean checkMessageStartWith() {
        return message.startsWith("!!");
    }

    public int checkMessageLength() {
        return message.length(); // Use in sign up forms
    }

    public int checkMessageIndexOf() {
        return message.indexOf("h"); // return -1 if we put invalid input
    }

    public String replaceCharacter() {
        return message.replace("!","*"); /* target and replacement are parameters but
                                                             ! and * are arguments. */

/*       return message; --> Strings are immutable(not changeable) in Java. So, we have received original
         message value as output which is "Hello Ashkan!!".
 */
    }

    public String toLowerCase() {
        return message.toLowerCase();
    }

    public String trim() {
        return message.trim();
    }
}
