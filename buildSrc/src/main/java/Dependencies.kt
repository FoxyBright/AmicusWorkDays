import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

private const val impl = "implementation"

private const val composeNavigationVer = "2.5.2"
private const val materialVer = "1.2.0-alpha01"
private const val composeActivityVer = "1.7.1"
private const val composeUiVer = "1.4.3"

private const val lifecycleRuntimeVer = "2.6.1"
private const val coroutinesCoreVer = "1.6.4"
private const val appcompatVer = "1.6.1"
private const val coreKtxVer = "1.10.1"

private const val swipeRefreshVer = "0.24.13-rc"
private const val browserVer = "1.5.0"
private const val coilVer = "2.2.2"
private const val koinVer = "3.3.3"
private const val ktorVer = "2.2.3"

/**
 * Зависимости для FEATURE-модуля
 * **/
fun DependencyHandlerScope.feature() =
    base() and compose()

/**
 * Зависимости для SHARED-модуля
 * **/
fun DependencyHandlerScope.shared() =
    base() and compose()

/**
 * Зависимости для основного модуля проекта
 * **/
fun DependencyHandlerScope.app() =
    base() and compose() and koin()

/**
 * Зависимости для DOMAIN-модуля
 * **/
fun DependencyHandlerScope.domain() = base()

/**
 * Зависимости для CORE-модуля
 * **/
fun DependencyHandlerScope.core() = base()

/**
 * Зависимости для DATA-модуля
 * **/
fun DependencyHandlerScope.data() = base() and ktor()

/**
 * Базовый список зависимостей необходимых для работы проекта
 * **/
fun DependencyHandlerScope.base() = implementation(
    "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesCoreVer",
    "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeVer",
    "androidx.compose.material3:material3:$materialVer",
    "androidx.appcompat:appcompat:$appcompatVer",
    "androidx.browser:browser:$browserVer",
    "androidx.core:core-ktx:$coreKtxVer"
)

/**
 * SwipeRefresh - Библиотека для возможности
 * обновления экранов свайпом сверху вниз
 * **/
fun DependencyHandlerScope.swipeRefresher() = implementation(
    "com.google.accompanist:accompanist-swiperefresh:$swipeRefreshVer"
)

/**
 * Compose - Библиотека для декларативной разработки UI
 * **/
fun DependencyHandlerScope.compose() = implementation(
    "androidx.navigation:navigation-compose:$composeNavigationVer",
    "androidx.activity:activity-compose:$composeActivityVer",
    "androidx.compose.ui:ui-tooling-preview:$composeUiVer",
    "androidx.compose.ui:ui-test-manifest:$composeUiVer",
    "androidx.compose.ui:ui-tooling:$composeUiVer",
    "androidx.compose.ui:ui-util:$composeUiVer",
    "androidx.compose.ui:ui:$composeUiVer",
    "androidx.compose.ui:ui-graphics"
) and swipeRefresher() and coil()

/**
 * Koin - Библиотека для внедрения зависимостей (DI)
 * **/
private fun DependencyHandlerScope.koin() = implementation(
    "io.insert-koin:koin-android:$koinVer",
    "io.insert-koin:koin-core:$koinVer"
)

/**
 * Coil - Библиотека для подгрузки изображений с сервера
 * **/
private fun DependencyHandlerScope.coil() = implementation(
    "io.coil-kt:coil-compose:$coilVer"
)

/**
 * Ktor - Библиотека для поддержки запросов REST API и WebSocket'ов
 * **/
private fun DependencyHandlerScope.ktor() = implementation(
    "io.ktor:ktor-client-content-negotiation:$ktorVer",
    "io.ktor:ktor-client-content-negotiation:$ktorVer",
    "io.ktor:ktor-serialization-jackson:$ktorVer",
    "io.insert-koin:koin-android:$koinVer",
    "io.ktor:ktor-client-logging:$ktorVer",
    "io.ktor:ktor-client-okhttp:$ktorVer",
    "io.insert-koin:koin-core:$koinVer",
    "io.ktor:ktor-client-core:$ktorVer",
    "io.ktor:ktor-client-core:$ktorVer",
    "io.ktor:ktor-client-cio:$ktorVer"
)

/**
 * Расширение для возможности обьединения методов возвращающих Unit
 * **/
@Suppress("unused_parameter")
infix fun Unit.and(o: Unit) {
}

/**
 * Расширение для возможности добавления новых зависимостей в gradle файлы
 * **/
private fun DependencyHandler.implementation(
    vararg dependencyNotations: Any,
) = dependencyNotations.forEach { add(impl, it) }