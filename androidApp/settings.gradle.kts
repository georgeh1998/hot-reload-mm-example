pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "androidApp"
include(":app")
include(":shared-hotreloadable")
project(":shared-hotreloadable").projectDir = file("../desktopApp/shared-hotreloadable")
include(":shared-non-hotreloadable")
project(":shared-non-hotreloadable").projectDir = file("../shared-non-hotreloadable")
 