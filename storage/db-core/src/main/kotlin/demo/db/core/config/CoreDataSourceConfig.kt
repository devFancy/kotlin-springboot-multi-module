package demo.db.core.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
 * HikariCP 기반 데이터 소스 설정을 구성하는 클래스
 * - HikariCP는 경량화된 고성능 JDBC 커넥션 풀로, Spring Boot의 기본 데이터 소스 연결 풀 구현체이다.
 * - 이 클래스는 db-core.yml 파일의 설정 값을 사용하여 HikariCP 설정과 데이터 소스를 초기화한다.
 */
@Configuration
internal class CoreDataSourceConfig {

    /**
     * db-core.yml 파일의 storage.datasource.core 섹션에서 설정된 값을 HikariConfig 객체로 매핑한다.
     * Spring Boot의 @ConfigurationProperties 애노테이션을 사용하여 YAML이나 properties 파일에서 storage.datasource.core의 값을 읽어온다.
     * 결과적으로, HikariCP 연결 풀(HikariConfig)의 설정을 동적으로 구성한다.
     * HikariConfig 객체는 이후 데이터 소스(HikariDataSource)를 생성하는 데 사용된다.
     */

    /**
     * 참고: @ConfigurationProperties
     * - 공식문서: https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config.typesafe-configuration-properties
     */
    @Bean
    @ConfigurationProperties(prefix = "storage.datasource.core")
    fun coreHikariConfig(): HikariConfig {
        return HikariConfig()
    }

    /**
     * 위에서 생성된 coreHikariConfig 설정을 사용하여 HikariCP 연결 풀(HikariDataSource) 인스턴스를 생성한다.
     * HikariDataSource 는 실제로 애플리케이션에서 사용할 데이터 소스를 나타낸다.
     * Spring 컨텍스트에 등록된 HikariDataSource Bean은 JPA, JDBC 템플릿, 트랜잭션 관리 등 Spring의 데이터 접근 관련 기능에서 기본 데이터 소스로 사용된다.
     * 여러 데이터 소스가 존재할 경우, `@Qualifier("coreHikariConfig")`를 사용하여 `coreHikariConfig` Bean을 명시적으로 주입받는다.
     */
    @Bean
    @Primary
    fun coreDataSource(@Qualifier("coreHikariConfig") config: HikariConfig): HikariDataSource {
        return HikariDataSource(config)
    }
}