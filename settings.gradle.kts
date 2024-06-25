rootProject.name = "spring-cloud-ecosystem"


include(
    "training_for_spring_cloud_features",
    "training_for_spring_cloud_features:lib",
    "training_for_spring_cloud_features:lib:trace",

    "training_for_spring_cloud_features:infra",
    "training_for_spring_cloud_features:infra:resource-monitor",
    "training_for_spring_cloud_features:infra:service-discovery",
    "training_for_spring_cloud_features:infra:api-gateway",
    "training_for_spring_cloud_features:infra:configuration-server",

    "training_for_spring_cloud_features:app:cookie-shop",
)

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