package cn.nokehubert.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//被注解的扫描器，在正常使用条件下的 mapper 文件所使用的扫描器
//@MapperScan(basePackages = "cn.nokehubert.gmall.user.mapper")
//要使用通用 mapper ，必须在这里指定通用mapper所使用的扫描器
@SpringBootApplication
@MapperScan(basePackages = "cn.nokehubert.gmall.user.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
