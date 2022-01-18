import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void okToFailButShouldStillBuildJar() {
        System.out.println("This should go in a 'Test-output.txt' file");
        Assert.fail("This test failure is OK, you should make sure to set the surefire plugin so that it still continues the build.");
    }
}
