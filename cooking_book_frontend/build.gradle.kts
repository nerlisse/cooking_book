plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.6.11" // Используем актуальную версию Compose
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.21"  // Для kotlinx.serialization
}

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser {
            // Настройка для генерации main.js через Webpack
            webpackTask {
                // Используем правильное свойство для задания имени выходного файла
                mainOutputFileName = "main.js" // Название выходного файла

                // Настроим путь для скомпилированных файлов с использованием layout
                outputDirectory.set(project.layout.buildDirectory.dir("js"))
            }
        }
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)

                // Для Compose HTML, а не старый kotlinx.html
                implementation(compose.html.core)
            }
        }

        val jsMain by getting {
            dependencies {
                // Ktor для работы с клиентом JS
                implementation("io.ktor:ktor-client-core:2.3.12")
                implementation("io.ktor:ktor-client-js:2.3.12")
                implementation("io.ktor:ktor-client-content-negotiation:2.3.12")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.12")

                // Сериализация
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
            }
        }
    }
}