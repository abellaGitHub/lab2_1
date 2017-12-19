package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Lukasz on 2017-12-19.
 */
public class SearchResultTest {

    @Test
    public void checkByIsFoundThatElementExistsInOneElementSequence() {
        int element = 11;
        int[] sequence = {11};

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.isFound());
    }

    @Test
    public void checkByGetPositionThatElementExistsInOneElementSequence() {
        int element = 11;
        int[] sequence = {11};
        int positionWhenElementNotExist = -1;

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.getPosition() > positionWhenElementNotExist);
    }

    @Test
    public void checkByIsFoundThatElementNotExistsInOneElementSequence() {
        int element = 121;
        int[] sequence = {11};

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertFalse(searchResult.isFound());
    }

    @Test
    public void checkByGetPositionThatNotElementExistsInOneElementSequence() {
        int element = 121;
        int[] sequence = {11};
        int positionWhenElementNotExist = -1;

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.getPosition() == positionWhenElementNotExist);
    }

    @Test
    public void elementIsFirsElementInMoreThanOneElementSequence() {
        int element = 121;
        int[] sequence = {121, 122, 123, 124, 125, 127};
        int firstPositionInSequence = 1;

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.getPosition() == firstPositionInSequence);
    }

    @Test
    public void elementIsLastElementInMoreThanOneElementSequence() {
        int element = 121;
        int[] sequence = {117, 118, 119, 120, 121};
        int lastPositionInSequence = sequence.length;

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.getPosition() == lastPositionInSequence);
    }

    @Test
    public void elementIsCenterElementOfMoreThanOneElementSequence() {
        int element = 121;
        int[] sequence = {117, 118, 119, 120, 121, 122, 123, 124, 125};
        int centerPositionInSequence = 5;

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.getPosition() == centerPositionInSequence);
    }

    @Test
    public void checkByIsFoundThatElementNotExistsInMoreThanOneElementSequence() {
        int element = 10;
        int[] sequence = {11, 12, 23, 14, 15, 16};

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertFalse(searchResult.isFound());
    }

    @Test
    public void checkByGetPositionThatElementNotExistsInMoreThanOneElementSequence() {
        int element = 10;
        int[] sequence = {11, 12, 23, 14, 15, 16};
        int positionWhenElementNotExist = -1;

        SearchResult searchResult = BinarySearch.search(element, sequence);

        assertTrue(searchResult.getPosition() == positionWhenElementNotExist);
    }

    @Test
    public void checkThatEmptySequenceThrowEmptySequenceException() {
        int element = 0;
        int[] sequence = {};
        boolean trueIfEmptySequenceExeption = false;

        try {
            SearchResult searchResult = BinarySearch.search(element, sequence);
        } catch (EmptySequenceException emptySequenceException) {
            trueIfEmptySequenceExeption = true;
        }

        assertThat(trueIfEmptySequenceExeption, is(true));
    }

}