import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {  // "root" - это id элемента в index.html
        Div {
            Text("Hello, Cooking Book!")  // Просто выводим текст
        }
    }
}
