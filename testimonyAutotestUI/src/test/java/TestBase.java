import manager.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

public abstract class TestBase {
    protected final ApplicationManager applicationManager = new ApplicationManager();

    @Before
    @BeforeEach
    public void setupPage() throws IOException {
        applicationManager.init();
    }

    @After
    @AfterEach
    public void closePage() {
        applicationManager.close();
    }
}
