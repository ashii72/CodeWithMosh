package com.ashkan.types;

import java.util.Date;

public class ReferenceTypes {

    byte age = 30;
    Date now = new Date();

    public Date getDate() {
        return now;
    }

      /* Memory allocation has happened automatically by JRE(Java Runtime Environment)
         but note that you don't need to managed it manually. */
}
