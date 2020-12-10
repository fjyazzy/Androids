package com.fjsdxy.j093a4;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.fjsdxy.j093a4", appContext.getPackageName());
    }

    public void test() throws Exception {
        final int expected = 1;
        final int reality = 1;
//        final int reality = 2;
        //断言,expected期望的参数值与reality相同
        assertEquals(expected, reality);
    }
}