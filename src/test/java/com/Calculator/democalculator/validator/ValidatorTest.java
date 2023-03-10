package com.Calculator.democalculator.validator;

import com.Calculator.democalculator.Validator.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {


    @Test
    @DisplayName("Should return true if a valid phone number is provided")
    public void testIsPhoneNumberValid_ValidPhoneNumber_ReturnsTrue() {
        assertTrue(Validator.isPhoneNumberValid("0120102022"));
        assertFalse(Validator.isPhoneNumberValid("sajshajhs0212"));
    }

    @Test
    @DisplayName("Should return false if the phone number does not start with 0")
    public void testIsPhoneNumberValid_PhoneNumberDoesNotStartWithZero_ReturnsFalse() {
        assertFalse(Validator.isPhoneNumberValid("120102022"));

    }

    @Test
    @DisplayName("Should return false if the phone number is too short")
    public void testIsPhoneNumberValid_PhoneNumberTooShort_ReturnsFalse() {
        assertFalse(Validator.isPhoneNumberValid("01234"));
    }

    @Test
    @DisplayName("Should return fasle if the phone number is too long")
    public void testIsPhoneNumberValid_PhoneNumberIsTooLong_ReturnFalse() {
        assertFalse(Validator.isPhoneNumberValid("01234567890"));
    }


    @Test
    @DisplayName("Should return true if the email a valid email is provided")
    public void testIsEmailValid_ValidEmail_ReturnsTrue() {

        assertTrue(Validator.isEmailValid("Mina@gmail.com"));
    }

    @Test
    @DisplayName("Should return false if the email does not contain @ sign")
    public void testIsEmailValid_EmailWithoutAtSign_ReturnsFalse() {
        assertFalse(Validator.isEmailValid("ali.example.com"));
    }

    @Test
    @DisplayName("Should return false if any required part of the email is missing")
    public void testIsEmailValid_EmailWithMissingRequiredParts_ReturnsFalse() {

        assertFalse(Validator.isEmailValid("joanna@.example."));
    }

    @Test
    @DisplayName("Should return false if the email does not contain a top-level domain")
    public void testIsEmailInvalid_EmailWithMissingDomainName_ReturnFalse() {
        assertFalse(Validator.isEmailValid("hanna@.com"));
    }

}

