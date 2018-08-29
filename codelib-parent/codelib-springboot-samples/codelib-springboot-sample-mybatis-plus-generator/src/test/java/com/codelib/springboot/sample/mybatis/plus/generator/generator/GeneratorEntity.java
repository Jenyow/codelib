package com.codelib.springboot.sample.mybatis.plus.generator.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * Mybatis-plus 代码生成器
 * 各项配置可以查看源码
 */
public class GeneratorEntity {

    @Test
    public void generateCode() {
        /*
        generateByTables("authority", "authority_resource", "group_authority", "group_member",
                "persistent_login", "resource", "user", "user_group");
*/
        generateByTables("SYS_USER_PROFILE");

    }

    private void generateByTables(String... tableNames) {
 //       String dbUrl = "jdbc:mysql://localhost:3306/yowshare_dashboard";
 //       String packageName = "top.xzhanyao.yowshare.dashboard";
        String dbUrl = "jdbc:sqlserver://192.168.1.222:1433;DatabaseName=YowaDB";
        String packageName = "entities.admin";

        String author = "zhanyao";
        String outputDir = "E:\\codeGen";
        String username = "sa";
        String password = "qmpw@word1";

        // 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setAuthor(author);
        config.setOutputDir(outputDir);
        config.setFileOverride(true);
        config.setServiceName("%sService");// 默认: I%sService
        config.setEntityName("%sInfo");

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.SQL_SERVER);
        dataSourceConfig.setUrl(dbUrl);
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);
        dataSourceConfig.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true);
        strategyConfig.setEntityLombokModel(false);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setInclude(tableNames);// 修改替换成你需要的表名，多个表名传数组
        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName);
        packageConfig.setController("controller");
        packageConfig.setXml("mapper");

        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                // 模版引擎默认是 Veloctiy，选择 freemarker 需要添加指定模版引擎
                //.setTemplate(new FreemarkerTemplateEngine())
                .execute();
    }

}
