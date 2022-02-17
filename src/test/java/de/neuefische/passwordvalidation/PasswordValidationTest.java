package de.neuefische.passwordvalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidationTest {

    @Test
    void shouldBeTrueIfPassesLengthDigitLowerUpper() {

        // given
        String testWord = "Hello1World";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertTrue(isValid);
    }


    @Test
    void shouldBeFalseIfNotPassesLengthDigitLowerUpper() {

        // given
        String testWord = "";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLenght() {

        // given
        String testWord = "        ";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesUpper() {

        // given
        String testWord = "FISCHE";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLower() {

        // given
        String testWord = "fische";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLengthDigit() {

        // given
        String testWord = "12345678";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLengthUpper() {

        // given
        String testWord = "NEUEFISCHE";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLengthLower() {

        // given
        String testWord = "neuefische";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesDigitUpper() {

        // given
        String testWord = "F1SCHE";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesDigitLower() {

        // given
        String testWord = "f1sche";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLowerUpper() {

        // given
        String testWord = "Fische";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLengthDigitLower() {

        // given
        String testWord = "neuef1sche";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesLengthLowerUpper() {

        // given
        String testWord = "NeueFische";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseIfOnlyPassesDigitLowerUpper() {

        // given
        String testWord = "F1sche";

        // when
        boolean isValid = PasswordValidation.checkPassword(testWord);

        // then
        Assertions.assertFalse(isValid);
    }


    @Test
    void shouldBeFalseBecauseOfFalseOfFirstSecondAndLastPassword() {

        // given
        String[] passwords = new String[]{"012345", "Passwort", "NaSowas5", "KeineAhnung"};

        // when
        boolean isValid = PasswordValidation.checkListOfPasswords(passwords);

        // then
        Assertions.assertFalse(isValid);
    }
}