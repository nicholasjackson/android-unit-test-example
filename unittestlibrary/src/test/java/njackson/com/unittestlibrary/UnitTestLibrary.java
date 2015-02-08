package njackson.com.unittestlibrary;

import android.location.Location;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UnitTestLibrary {

    @Before
    public void setup() {

    }

    @Test
    public void test_mock_asserts_correctly() {
        Location location = mock(Location.class);
        when(location.getLatitude()).thenReturn(1234d);

        assertEquals(1234d, location.getLatitude(),0);
    }

    @Test
    public void test_concrete_asserts_correctly() {
        Location location = new Location("TEST LOCATION");
        location.setLatitude(1234d);

        assertEquals(1234d, location.getLatitude(),0);
    }

    @Test
    public void test_simple_asserts_correctly() {
        double test = 1234d;

        assertEquals(1234d, test,0);
    }

}