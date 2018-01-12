package lab2_1;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestTask2_1 {

    boolean testResult = false;
    final int[] longSeq = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    SearchResult searchResult;
    int key;
    int position;

    @org.junit.Test
    public void elementPresentInOneCharacterSequence() {
        key = 10;
        int[] seq = {10};
        position = 1;

        searchResult = BinarySearch.search(key, seq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementNotPresentInOneCharacterSequence() {

        key = 10;
        int[] seq = {20};

        searchResult = BinarySearch.search(key, seq);
        testResult = searchResult.isFound() == false && searchResult.getPosition() == -1;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementPresentAtFirstPositionInLongSequence() {
        key = 10;
        position = 1;

        searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementPresentAtLastPositionInLongSequence() {
        key = 20;
        position = 11;

        searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementPresentAtMiddlePositionInLongSequence() {
        key = 15;
        position = 6;

        searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void elementNotPresentnInLongSequence() {
        key = 22;

        searchResult = BinarySearch.search(key, longSeq);
        testResult = searchResult.isFound() == false && searchResult.getPosition() == -1;
        assertThat(testResult, Matchers.is(true));
    }

    @org.junit.Test
    public void emptySequence() {
        key = 22;
        int[] emptySeq = {};

        try {
            searchResult = BinarySearch.search(key, emptySeq);
        } catch (IllegalArgumentException e) {
            testResult = true;
        }

        assertThat(testResult, Matchers.is(true));

    }

    @org.junit.Test
    public void elementPresentAtMiddlePositionInOddSequence() {
        int key = 12;
        int[] oddSeq = {10, 11, 12, 13, 14, 15};
        int position = 3;

        searchResult = BinarySearch.search(key, oddSeq);
        testResult = searchResult.isFound() == true && searchResult.getPosition() == position;
        assertThat(testResult, Matchers.is(true));
        assertThat(searchResult.getPosition(), Matchers.is((oddSeq.length - 1) / 2 + 1));
    }
}
