dependencies {
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
    implementation("org.springframework.cloud:spring-cloud-starter-task")
    implementation("de.codecentric:spring-boot-admin-starter-client:3.3.0")
    implementation("io.github.openfeign:feign-micrometer")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
    implementation(project(":training_for_spring_cloud_features:lib:trace"))
}

tasks {
    bootJar {
        enabled = true
    }
}