package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void parseValidation() {
        // separate fields only if ',' between them
        // if no ',' exists --> store line as one field
        // if exists ',' and any other separators like '.'
        // ',' at first of line
        // ',' at end of line
        // number of fields > no of commas by 1
    }

}