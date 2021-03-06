package connect.four.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class is the test suite that will run all other tests
 * implemented in the system. Currently, it will run
 * CustomerTest followed by BankAccountTest. The main class
 * is intentionally left blank.
 */

@RunWith(Suite.class)
@SuiteClasses({TestBoard.class, TestComputerPlayer.class, TestConsolePlayer.class,
        TestGUI.class, TestIntegration.class, TestRandomPlayer.class})

public class TestSuite {
}