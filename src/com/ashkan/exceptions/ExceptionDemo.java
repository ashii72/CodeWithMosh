package com.ashkan.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ExceptionDemo {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            // e.printStackTrace();
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }

        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ) {
            var value = reader.read();
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }
    }
}
