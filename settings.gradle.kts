rootProject.name = "spring-cloud-ecosystem"


include()

pluginManagement {
    val kotlinVersion = "1.9.24"
    val springBootVersion = "3.3.0"
    val springDependencyVersion = "1.1.5"
    val graalVmVersion = "0.10.2"
    val protobufGradlePluginVersion = "0.9.4"

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyVersion)
                "org.graalvm.buildtools.native" -> useVersion(graalVmVersion)
                "com.google.protobuf" -> useVersion(protobufGradlePluginVersion)
            }
        }
    }
}