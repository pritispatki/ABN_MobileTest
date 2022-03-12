package com.abnamro.apps.referenceandroid.pageobject

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.abnamro.apps.referenceandroid.R
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.instanceOf

class MainScreen {

    private val toolbarId = R.id.toolbar
    private val fragmentId = R.id.fragment
    private val mailIconId = R.id.fab
    private val titleId = R.id.title

    fun checkToolBarText(toolbarText: String) {
        onView(
            allOf(
                instanceOf(TextView::class.java),
                (withParent(withId(toolbarId)))
            )
        ).check(matches(withText(toolbarText)))
    }

    fun checkMainScreenText(mainScreenText: String) {
        onView(
            allOf(
                instanceOf(TextView::class.java),
                (withParent(withId(fragmentId)))
            )
        ).check(matches(withText(mainScreenText)))
    }

    fun clickMailIcon(){
        onView(withId(mailIconId)).perform(click())
    }

    fun checkSnackBarText(snackbarText: String){
        onView(withText(snackbarText)).check(matches(isDisplayed()))
    }

    fun clickKebabMenu(contentDescriptionMenu:String){
        onView(withContentDescription(contentDescriptionMenu)).perform(click())
    }

    fun checkMoreOptionsMenu(menuText: String){
        onView(allOf(withId(titleId), withText(menuText))).check(matches(isDisplayed()))
    }
}