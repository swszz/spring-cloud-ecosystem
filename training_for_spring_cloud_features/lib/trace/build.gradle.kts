dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    //implementation("io.micrometer:micrometer-tracing-bridge-otel")

    implementation("io.zipkin.reporter2:zipkin-reporter-brave")
    implementation("io.micrometer:micrometer-tracing-bridge-brave")

    //implementation("io.opentelemetry:opentelemetry-exporter-zipkin")


    implementation("io.zipkin.reporter2:zipkin-sender-urlconnection")
}