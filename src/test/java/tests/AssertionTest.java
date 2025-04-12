package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class AssertionTest {

    @Test(groups = {"regression"})
    public void assertionExamples() {

        Assert.assertTrue(true, "expecting true to be returned");

        Assert.assertFalse(false);

        Assert.assertEquals(1, 2, "actual vs expected mismatch");
    }

}
