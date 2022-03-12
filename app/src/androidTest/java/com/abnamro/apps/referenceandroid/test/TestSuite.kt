package com.abnamro.apps.referenceandroid.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.pageobject.MainScreen

import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import com.abnamro.apps.referenceandroid.MainActivity

@RunWith(AndroidJUnit4::class)
class TestSuite {

    val TOOLBAR_TEXT = "ReferenceAndroid"
    val MAIN_SCREEN_TEXT = "Hello World!"
    val SNACKBAR_TEXT = "Replace with your own action"
    val CONTENT_DESCRIPTION_MENU = "More options"
    val MENU_TEXT = "Settings"

    @get:Rule
    var activityRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    private val mainScreen = MainScreen()

    @Test
    fun testToolBarText() {
        mainScreen.checkToolBarText(TOOLBAR_TEXT)
    }

    @Test
    fun testMainScreenCenterText(){
        mainScreen.checkMainScreenText(MAIN_SCREEN_TEXT)
    }

    @Test
    fun testSnackBarIsDisplayed(){
        mainScreen.clickMailIcon()
        mainScreen.checkSnackBarText(SNACKBAR_TEXT)
    }

    @Test
    fun testKebabMenu(){
        mainScreen.clickKebabMenu(CONTENT_DESCRIPTION_MENU)
        mainScreen.checkMoreOptionsMenu(MENU_TEXT)
    }
}