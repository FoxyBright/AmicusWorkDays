import org.gradle.api.JavaVersion.VERSION_1_8

object Config {
    
    const val applicationId = "com.amicus.workdays"
    
    const val testInstrumentationRunner =
        "androidx.test.runner.AndroidJUnitRunner"
    
    private const val rules = "rules.pro"
    const val proguard = "proguard-$rules"
    const val consumer = "consumer-$rules"
    const val proguardFile = "proguard-android-optimize.txt"
    
    val kotlinCompilerExVer = "1.4.7"
    val kotlinCompilerVer = "1.5.30"
    const val jvmTarget = "1.8"
    
    val useSupportLibrary = true
    val isMinifyEnabled = false
    
    val sourceCompatibility = VERSION_1_8
    val packagingOptExclude = "/META-INF/{AL2.0,LGPL2.1}"
    
    const val compileSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val minSdk = 26
    
    const val targetSdk = compileSdk
}