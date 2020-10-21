import manager.ApplicationManager;
import org.junit.After;
import org.junit.Before;

public abstract class TestBase {
    protected final ApplicationManager applicationManager = new ApplicationManager();

    @Before
    public void setupPage() throws InterruptedException {
        applicationManager.init();
    }

    @After
    public void closePage() {
        applicationManager.close();
    }
}
