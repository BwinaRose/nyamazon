package com.codedifferently.codingchallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    // Problem 01
    @Test
    public void doubleXXTest01() {

        // Given
        String str = "abcxx";

        // When
        Integer expected = 1;
        Integer actual = Problem.doubleXX(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleXXTest02() {

        // Given
        String str = "xxx";

        // When
        Integer expected = 2;
        Integer actual = Problem.doubleXX(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleXXTest03() {

        // Given
        String str = "xxxx";

        // When
        Integer expected = 3;
        Integer actual = Problem.doubleXX(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 02
    @Test
    public void mysteryExplosionTest01() {

        // Given
        String str = "Code";

        // When
        String expected = "CCoCodCode";
        String actual = Problem.mysteryExplosion(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mysteryExplosionTest02() {

        // Given
        String str = "abc";

        // When
        String expected = "aababc";
        String actual = Problem.mysteryExplosion(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mysteryExplosionTest03() {

        // Given
        String str = "ab";

        // When
        String expected = "aab";
        String actual = Problem.mysteryExplosion(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 03
    @Test
    public void topTeamsTest01() {

        // Given
        int[] nums = {1, 2, 9, 3, 4};

        // When
        Boolean expected = true;
        Boolean actual = Problem.topTeams(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void topTeamsTest02() {

        // Given
        int[] nums = {1, 2, 3, 4, 9};

        // When
        Boolean expected = false;
        Boolean actual = Problem.topTeams(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void topTeamsTest03() {

        // Given
        int[] nums = {1, 2, 3, 4, 5};

        // When
        Boolean expected = false;
        Boolean actual = Problem.topTeams(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 04
    @Test
    public void xtinctionTest01() {

        // Given
        String str = "xxHxix";

        // When
        String expected = "xHix";
        String actual = Problem.xtinction(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void xtinctionTest02() {

        // Given
        String str = "abxxxcd";

        // When
        String expected = "abcd";
        String actual = Problem.xtinction(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void xtinctionTest03() {

        // Given
        String str = "xabxxxcdx";

        // When
        String expected = "xabcdx";
        String actual = Problem.xtinction(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 05
    @Test
    public void agent667Test01() {

        // Given
        int[] nums = {6, 6, 2};

        // When
        Integer expected = 1;
        Integer actual = Problem.agent667(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void agent667Test02() {

        // Given
        int[] nums = {6, 6, 2, 6};

        // When
        Integer expected = 1;
        Integer actual = Problem.agent667(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void agent667Test03() {

        // Given
        int[] nums = {6, 7, 2, 6};

        // When
        Integer expected = 1;
        Integer actual = Problem.agent667(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
