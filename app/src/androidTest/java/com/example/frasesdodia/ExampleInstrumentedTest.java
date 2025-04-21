package com.example.frasesdodia;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
* Teste instrumentado, que será executado em um dispositivo Android.
*
* @consulte <a href="http://d.android.com/tools/testing">Documentação de testes</a>
*/
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.frasesdodia", appContext.getPackageName());
    }
}
