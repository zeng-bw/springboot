package org.gunanyi.config;

//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描dao或者是Mapper接口
@MapperScan("**.mapper*")
public class MybatisPlusConfig {
    /**
     * mybatis-plus 分页插件
     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor page = new PaginationInterceptor();
//        page.setDialectType("mysql");
//        return page;
//    }

//    /**
//     * SQL执行效率插件
//     * 性能分析拦截器，用于输出每条 SQL 语句及其执行时间
//     */
//    @Bean
//    @Profile({"dev", "pro"})// 设置 dev pro 环境开启
//    public PerformanceInterceptor performanceInterceptor() {
//        return new PerformanceInterceptor();
//    }
}