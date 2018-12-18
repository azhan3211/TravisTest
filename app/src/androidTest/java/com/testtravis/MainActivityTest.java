package com.testtravis;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testButton() {
        onView(withId(R.id.inputET))
                .perform(typeText("Test"))
                .perform(closeSoftKeyboard());

        onView(withId(R.id.clickButton))
                .perform(click());

//        onView(withId(R.id.labelTV))
//                .check(matches(withText("Test")));

        onView(withId(R.id.labelTV))
                  .check(matches(withText("Test1")));

    }

    @After
    public void tearDown() throws Exception {
    }
}