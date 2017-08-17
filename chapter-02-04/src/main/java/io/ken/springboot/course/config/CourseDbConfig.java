package io.ken.springboot.course.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "io.ken.springboot.course.dao.course", sqlSessionFactoryRef = "courseSqlSessionFactory")
public class CourseDbConfig {

    @Bean(name = "courseDataSource")
    @ConfigurationProperties(prefix = "courseDataSource")
    @Primary
    public DataSource courseDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "courseSqlSessionFactory")
    @Primary
    public SqlSessionFactory courseSqlSessionFactory(@Qualifier("courseDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:conf/mybatis/mapper/course/*.xml"));
        return bean.getObject();
    }

}
