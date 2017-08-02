package connect.four.test;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

/**
 * This class is the test suite that will run all other tests
 * implemented in the system. Currently, it will run
 * CustomerTest followed by BankAccountTest. The main class
 * is intentionally left blank.
 */

@RunWith(Suite.class)
@SuiteClasses({ testBoard.class, testGame.class, testPlayer.class })

public class testSuite {
}