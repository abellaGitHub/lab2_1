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
}
