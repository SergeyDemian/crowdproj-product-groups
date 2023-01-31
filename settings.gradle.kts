rootProject.name = "crowdproj-product-groups"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

include("home-work-1")