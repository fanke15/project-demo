package com.gen.core.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Slf4j
public class DataSourceConfig extends HikariConfig{
    @Bean(name = "primaryDataSource")
    @Primary
    public DataSource primaryDataSource() {
        log.info("Connecting to datasource pool...");

        return new HikariDataSource(this);
    }
}
