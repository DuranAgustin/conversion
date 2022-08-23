package com.tlglearning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "parse-valid.csv", numLinesToSkip = 1)
    void parse_valid(String representation, int radix, int expected) {
        assertEquals(expected, Conversion.parse(representation, radix));
    }

}