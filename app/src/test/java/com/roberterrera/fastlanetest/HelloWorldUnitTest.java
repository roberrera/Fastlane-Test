package com.roberterrera.fastlanetest;

import android.os.Build;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)

public class HelloWorldUnitTest {

    private MainActivity activity;

    @Test
    public void shouldSayHello() throws Exception {
        String hello = new MainActivity().getResources().getString(
                R.string.hello_world);
        assertThat(hello, equalTo("Hello World!"));
    }

    @Before
    public void setup()  {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create().get();
    }
    @Test
    public void checkActivityNotNull() throws Exception {
        assertNotNull(activity);
    }


}