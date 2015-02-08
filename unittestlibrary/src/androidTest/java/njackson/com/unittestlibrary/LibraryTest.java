package njackson.com.unittestlibrary;

import android.location.Location;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class LibraryTest extends InstrumentationTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        System.setProperty("dexmaker.dexcache", getInstrumentation().getContext().getCacheDir().getPath());
    }

    @SmallTest
    public void test_mock_asserts_correctly() {
        Location location = mock(Location.class);
        when(location.getLatitude()).thenReturn(1234d);

        assertEquals(1234d, location.getLatitude(),0);
    }

    @SmallTest
    public void test_concrete_asserts_correctly() {
        Location location = new Location("TEST LOCATION");
        location.setLatitude(1234d);

        assertEquals(1234d, location.getLatitude(),0);
    }

    @SmallTest
    public void test_simple_asserts_correctly() {
        double test = 1234d;

        assertEquals(1234d, test,0);
    }

}