package com.example.smartstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.smartstudy.domain.model.Session
import com.example.smartstudy.domain.model.Subject
import com.example.smartstudy.domain.model.Task
import com.example.smartstudy.ui.theme.SmartStudyTheme
import com.example.smartstudy.ui.theme.components.Test
import com.example.smartstudy.ui.theme.dashboard.DashboardScreen
import com.example.smartstudy.ui.theme.subject.SubjectScreen
import com.example.smartstudy.ui.theme.task.TaskScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartStudyTheme {
               Test()
            }
        }
    }
}

val subjects  = listOf(
    Subject(name = "English", goalHours = 10f, colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "Physics", goalHours = 10f, colors = Subject.subjectCardColors[1],subjectId = 0),
    Subject(name = "Math", goalHours = 10f, colors = Subject.subjectCardColors[2],subjectId = 0),
    Subject(name = "Geology", goalHours = 10f, colors = Subject.subjectCardColors[3],subjectId = 0),
    Subject(name = "Fine Arts", goalHours = 10f, colors = Subject.subjectCardColors[4], subjectId = 0),
)
val tasks = listOf(
    Task(title = "Prepare notes", description = "", dueDate = 0L, priority = 1, relatedToSubject = "", isComplete = false, taskSubjectId = 0, taskId = 1),
    Task(title = "Coaching", description = "", dueDate = 0L, priority = 1, relatedToSubject = "", isComplete = false,taskSubjectId = 0, taskId = 1),
    Task(title = "Cook veggies and bread", description = "", dueDate = 0L, priority = 0, relatedToSubject = "", isComplete = true,taskSubjectId = 0, taskId = 1),
    Task(title = "Write Poem", description = "", dueDate = 0L, priority = 1, relatedToSubject = "", isComplete = false,taskSubjectId = 0, taskId = 1),
    Task(title = "Walk your pet", description = "", dueDate = 0L, priority = 2, relatedToSubject = "", isComplete = false,taskSubjectId = 0, taskId = 1),
)

val sessions = listOf(
    Session(relatedToSubject = "English", date = 0L, duration = 2, sessionSubjectId = 0, sessionId = 0),
    Session(relatedToSubject = "Physics", date = 0L, duration = 2, sessionSubjectId = 0, sessionId = 0),
    Session(relatedToSubject = "Physics", date = 0L, duration = 2, sessionSubjectId = 0, sessionId = 0),
    Session(relatedToSubject = "Math", date = 0L, duration = 2, sessionSubjectId = 0, sessionId = 0),
    Session(relatedToSubject = "English", date = 0L, duration = 2, sessionSubjectId = 0, sessionId = 0),
)
