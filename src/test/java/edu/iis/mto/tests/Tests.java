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
}
