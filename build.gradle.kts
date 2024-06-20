import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("com.google.protobuf")
	id("io.spring.dependency-management")
	id("org.springframework.boot")
	id("org.graalvm.buildtools.native")
	kotlin("jvm")
	kotlin("plugin.spring")
}

allprojects {
	repositories {
		gradlePluginPortal()
		mavenCentral()
	}
}


subprojects {
	apply {
		plugin("java")
		plugin("kotlin")
		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.springframework.boot")
		plugin("org.graalvm.buildtools.native")
		plugin("org.jetbrains.kotlin.plugin.spring")
		plugin("io.spring.dependency-management")
		plugin("com.google.protobuf")

	}

	tasks {
		bootJar {
			enabled = false
		}
		jar {
			enabled = true
		}

		withType<Test> {
			useJUnitPlatform()
			maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2)
		}

		withType<KotlinCompile> {
			kotlinOptions {
				freeCompilerArgs += "-Xjsr305=strict"
				jvmTarget = "17"
			}
		}

		compileKotlin {
			kotlinOptions.jvmTarget = "17"
		}

		compileTestKotlin {
			kotlinOptions.jvmTarget = "17"
		}
	}

	dependencyManagement {
		imports {
			mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.2")
		}
	}

	dependencies {
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	}

	java {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}
}