dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("de.codecentric:spring-boot-admin-starter-client:3.3.0")
    implementation(project(":training_for_spring_cloud_features:lib:trace"))
}

tasks {
    bootJar {
        enabled = true
    }
}