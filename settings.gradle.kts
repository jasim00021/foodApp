pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google();
        mavenCentral();
        maven { url = uri("https://jitpack.io") } // Use '=' instead of ';' for assigning values in Kotlin
    }
}

rootProject.name = "FoodOrder"
include(":app")
 