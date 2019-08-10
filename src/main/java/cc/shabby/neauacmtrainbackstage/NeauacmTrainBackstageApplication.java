package cc.shabby.neauacmtrainbackstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

@SpringBootApplication
public class NeauacmTrainBackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeauacmTrainBackstageApplication.class, args);
    }

//    @Bean
//    public OpenEntityManagerInViewFilter openEntityManagerInViewFilter() {
//        return new OpenEntityManagerInViewFilter();
//    }
}