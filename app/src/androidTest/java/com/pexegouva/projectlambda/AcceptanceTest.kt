package com.pexegouva.projectlambda

import android.app.Activity
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
abstract class AcceptanceTest<T : Activity>(clazz: Class<T>) {
  @get:Rule
  var activityRule: ActivityTestRule<T> = ActivityTestRule(clazz)

  fun context(): Context = ApplicationProvider.getApplicationContext()
}
