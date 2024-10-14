plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
    id("org.sonarqube") version "4.0.0.2929"
}

group = "im.etap"
version = "0.0.1-SNAPSHOT"

sonar {
    properties {
        property("sonar.projectName", "BIGS-CO-LTD_bigs-pay-backend-spring_AZKI_tW4Olz6suGrlpW3")
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
