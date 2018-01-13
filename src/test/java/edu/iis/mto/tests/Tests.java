package edu.iis.mto.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Tests {

    @Test
    public void elementSearchedIsInSequence() {
        int key = 1;
        int[] seq = {1};
        int position = 1;

        SearchResult res = BinarySearch.search(key, seq);

        assertTrue(res.isFound());
        assertEquals(res.getPosition(), position);
    }

    @Test
    public void elementSearchedIsNotInSequence() {
        int key = 0;
        int[] seq = {1};
        int position = -1;

        SearchResult res = BinarySearch.search(key, seq);

        assertFalse(res.isFound());
        assertEquals(res.getPosition(), position);
    }

    @Test
    public void elementSearchedIsFirstElementInSequence() {
        int key = 0;
        int[] seq = {0, 1, 2, 3, 4};
        int position = 1;

        SearchResult res = BinarySearch.search(key, seq);

        assertTrue(res.isFound());
        assertEquals(res.getPosition(), position);
    }

    @Test
    public void elementSearchedIsLastElementInSequence() {
        int key = 4;
        int[] seq = {0, 1, 2, 3, 4};
        int position = 5;

        SearchResult res = BinarySearch.search(key, seq);

        assertTrue(res.isFound());
        assertEquals(res.getPosition(), position);
    }

    @Test
    public void elementSearchedIsMiddleElementInSequence() {
        int key = 2;
        int[] seq = {0, 1, 2, 3, 4};
        int position = 3;

        SearchResult res = BinarySearch.search(key, seq);

        assertTrue(res.isFound());
        assertEquals(res.getPosition(), position);
    }

    @Test
    public void elementSearchedIsMiddlePlusOneElementInSequence() {
        int key = 3;
        int[] seq = {0, 1, 2, 3, 4, 5};
        int position = 4;

        SearchResult res = BinarySearch.search(key, seq);

        assertTrue(res.isFound());
        assertEquals(res.getPosition(), position);
    }

    @Test
    public void elementSearchedIsMiddleMinusOneElementInSequence() {
        int key = 2;
        int[] seq = {0, 1, 2, 3, 4, 5};
        int position = 3;

        SearchResult res = BinarySearch.search(key, seq);

        assertTrue(res.isFound());
        assertEquals(res.getPosition(), position);
    }
}
