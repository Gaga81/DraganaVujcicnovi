package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
import tests_with_login.*;

@RunWith(Suite.class)
//regression test
@Suite.SuiteClasses({FailedLoginPasswordTest.class, FailedLoginUsernameTest.class,
        SuccesLoginTest.class, LogOutTest.class,PurchaseTest.class, RemoveItemTest.class,
        RetistrationTest.class,CheckSelectedItemTest.class})
public class TestSuites {
}
