package lab2_1;

import static org.junit.Assert.assertTrue;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestTask2_1 {

    @org.junit.Test
    public void elementPresentInOneCharacterSequence() {
        int key = 10;
        int[] seq = {10};
        int position = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() == true && searchResult.getPosition() == position);
    }

    @org.junit.Test
    public void elementNotPresentInOneCharacterSequence() {
        int key = 10;
        int[] seq = {20};

        SearchResult result = BinarySearch.search(key, seq);
        assertTrue(result.isFound() == false && result.getPosition() == -1);
    }

    @org.junit.Test
    public void elementPresentAtFirstPositionInLongSequence() {
        int key = 10;
        int[] seq = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int position = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() == true && searchResult.getPosition() == position);
    }

    @org.junit.Test
    public void elementPresentAtLastPositionInLongSequence() {
        int key = 20;
        int[] seq = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int position = 11;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() == true && searchResult.getPosition() == position);
    }

    @org.junit.Test
    public void elementPresentAtMiddlePositionInLongSequence() {
        int key = 15;
        int[] seq = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int position = 6;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() == true && searchResult.getPosition() == position);
    }

    @org.junit.Test
    public void elementNotPresentnInLongSequence() {
        int key = 22;
        int[] seq = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() == false && searchResult.getPosition() == -1);
    }
}
