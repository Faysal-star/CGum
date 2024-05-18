package com.example.cgum;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.ViewPagerActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.google.firebase.auth.FirebaseAuth;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import android.content.Intent;
import android.view.View;

//@RunWith(AndroidJUnit4.class)
public class DashboardUiTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);
    @Before
    public void setUp() {
        Intents.init();
        FirebaseAuth.getInstance().signOut();
        activityRule.getScenario().close();
        activityRule.getScenario().launch(MainActivity.class);
        intended(hasComponent(Login.class.getName()));
        onView(withId(R.id.emailT)).perform(typeText("1@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.passT)).perform(typeText("123456"), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testNavigationToDashboard() {
        onView(withId(R.id.bottom_nav)).perform(click());
        onView(withId(R.id.dashboard)).check(matches(isDisplayed()));
    }

    @Test
    public void testNavigateToPostTab() {
        onView(withId(R.id.bottom_nav)).perform(click());
        onView(withId(R.id.dashboard)).perform(click());
        onView(withId(R.id.dashboard)).check(matches(isDisplayed()));
        onView(withId(R.id.viewPager)).perform(ViewPagerActions.scrollToPage(1));
        onView(withText("Share Your Knowledge")).check(matches(isDisplayed()));
    }

    @Test
    public void testPostContent() {
        onView(withId(R.id.bottom_nav)).perform(click());
        onView(withId(R.id.dashboard)).perform(click());
        onView(withId(R.id.dashboard)).check(matches(isDisplayed()));
        onView(withId(R.id.viewPager)).perform(ViewPagerActions.scrollToPage(1));
        onView(withId(R.id.pTitleT)).perform(typeText("Test Title"), closeSoftKeyboard());
        onView(withId(R.id.pDescrT)).perform(typeText("Test Description"), closeSoftKeyboard());
        onView(withId(R.id.pTagsT)).perform(typeText("C++"), closeSoftKeyboard());
        onView(withId(R.id.pPost)).perform(click());

        onView(withId(R.id.viewPager)).perform(ViewPagerActions.scrollToPage(0));
        onView(withId(R.id.posts)).check(matches(isDisplayed()));
    }
}
