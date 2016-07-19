package pl.dariuszbacinski.androidtestingbootstrap

import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import pl.dariuszbacinski.androidtestingbootstrap.view.MainActivity
import spock.lang.Specification

public class SmokeSpockSpec extends Specification {

    @Rule
    ActivityTestRule<MainActivity> searchActivityActivityTestRule = new ActivityTestRule(MainActivity)

    def 'always pass'() {
        expect:
            searchActivityActivityTestRule.activity
    }
}