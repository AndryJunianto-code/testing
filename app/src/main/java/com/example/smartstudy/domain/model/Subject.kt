package com.example.smartstudy.domain.model

import androidx.compose.ui.graphics.Color
import com.example.smartstudy.ui.theme.gradient1
import com.example.smartstudy.ui.theme.gradient2
import com.example.smartstudy.ui.theme.gradient3
import com.example.smartstudy.ui.theme.gradient4
import com.example.smartstudy.ui.theme.gradient5

data class Subject(
    val name: String,
    val goalHours: Float,
    val colors: List<Color>,
    val subjectId: Int
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}
