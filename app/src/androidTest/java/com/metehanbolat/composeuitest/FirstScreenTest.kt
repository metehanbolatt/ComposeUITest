package com.metehanbolat.composeuitest

import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class FirstScreenTest {

    @get:Rule
    val rule = createComposeRule()

    val buttonOne = hasText("1") and hasClickAction()
    val buttonTwo = hasText("2") and hasClickAction()
    val buttonThree = hasText("+") and hasClickAction()
    val buttonFour = hasText("/") and hasClickAction()

    @Test
    fun clickFirstButton() {
        rule.setContent { FirstScreen { } }

        // Do Something
        rule.onNode(buttonOne).performClick()
        rule.onNode(buttonTwo).performClick()
        rule.onNode(buttonThree).performClick()
        rule.onNode(buttonFour).performClick()

        // Check Something
        rule.onNodeWithText("12+/").assertExists()

    }

}