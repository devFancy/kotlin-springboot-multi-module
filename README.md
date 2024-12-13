# Kotlin SpringBoot Multi Module

This project provides a foundational structure for a Kotlin Spring Boot multi-module setup. 

While it may not represent the most advanced architecture, it is a good starting point for projects where initial productivity is a priority.

As your software evolves and scales, the structure can and should adapt accordingly.

![](./img/springboot-multi-module.png)

# Project Information

Kotlin Version: 1.6.21

Spring Boot Version: 2.7.1

Database: H2 (example implementation)

Build Tool: Gradle

# Module

## Core-api

This is the only executable module in the project. 

Handles API-related logic, including Controller classes.

Optimized for maximizing productivity during initial development stages.

## domain

Manages domain models and business logic.

Provides the core functionality of the application with a clear separation of concerns.

## storage

Submodule: This module is responsible for database-related operations and integrations.

### storage:db-core

Example of integrating with an H2 database using Spring Data JPA.

Serves as a template for connecting to other database or storage systems.

## Support

Submodule: This module contains auxiliary features such as logging and monitoring.

### support:logging

Manages application logging.

Supports integration with various logging frameworks.

### support:monitoring

Provides monitoring capabilities for services.

Ensures observability and performance tracking.

## Reference

> Here are the references and videos used when designing this project.

* [Github: spring-boot-kotlin-template](https://github.com/team-dodn/spring-boot-kotlin-template)

* [토스ㅣSLASH 22 - 지속 성장 가능한 코드를 만들어가는 방법](https://www.youtube.com/watch?v=RVO02Z1dLF8&ab_channel=토스)

* [지속 성장 가능한 소프트웨어를 만들어가는 방법](https://www.youtube.com/watch?v=pimYIfXCUe8&ab_channel=제미니의개발실무)

* [Youtube] SpringBoot + Kotlin 멀티 모듈 구성

    * [SpringBoot + Kotlin 멀티 모듈 구성 - 단일모듈에서 멀티모듈로 변경해보기 #1](https://www.youtube.com/watch?v=PdofVTuM-tE)

    * [SpringBoot + Kotlin 멀티 모듈 구성 - 의존성 버전 관리 + 로깅 모듈 추가하기 #2](https://www.youtube.com/watch?v=rE89ppAmf_Y)

    * [SpringBoot + Kotlin 멀티 모듈 구성 - DB 모듈 추가하기 #3](https://www.youtube.com/watch?v=ODSFmLdecX0)

    * [SpringBoot + Kotlin 멀티 모듈 구성 - 도메인 모듈 분리 #4](https://www.youtube.com/watch?v=p5ZMF2bpE6A)

* [모듈 분리 시 의존 관계 설정](https://www.youtube.com/watch?v=nVGV8ag8v7g&ab_channel=제미니의개발실무)

---

Special thanks to [geminiKim](https://github.com/geminiKim) for the original [spring-boot-kotlin-template](https://github.com/team-dodn/spring-boot-kotlin-template), which inspired the creation of this project.

If you'd like to check the latest versions of Kotlin, Spring Boot, or additional resources, I recommend visiting the spring-boot-kotlin-template repository.