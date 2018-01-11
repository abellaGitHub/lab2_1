package lab2_1;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestTask2_1 {

    boolean testResult = false;
    final int[] longSeq = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    @org.junit.Test
    public void elementPresentInOneCharacterSequence() {
        int key = 10;
        int[] seq = {10};
        int position = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementNotPresentInOneCharacterSequence() {

        int key = 10;
        int[] seq = {20};

        SearchResult searchResult = BinarySearch.search(key, seq);
        testResult = searchResult.isFound() == false && searchResult.getPosition() == -1;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementPresentAtFirstPositionInLongSequence() {
        int key = 10;
        int position = 1;

        SearchResult searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementPresentAtLastPositionInLongSequence() {
        int key = 20;
        int position = 11;

        SearchResult searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementPresentAtMiddlePositionInLongSequence() {
        int key = 15;
        int position = 6;

        SearchResult searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementNotPresentnInLongSequence() {
        int key = 22;

        SearchResult searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == false && searchResult.getPosition() == -1;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void emptySequence() {
        int key = 22;
        int[] emptySeq = {};

        try {
            SearchResult searchResult = BinarySearch.search(key, emptySeq);
        } catch (IllegalArgumentException e) {
            testResult = true;
        }

        assertThat(testResult, Matchers.is(true));

    }
}
