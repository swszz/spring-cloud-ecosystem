dependencies {
    implementation("de.codecentric:spring-boot-admin-starter-client:3.3.0")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-config-server")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation(project(":training_for_spring_cloud_features:lib:trace"))
}

tasks {
    bootJar {
        enabled = true
    }
}