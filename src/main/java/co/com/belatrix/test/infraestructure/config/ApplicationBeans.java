package co.com.belatrix.test.infraestructure.config;

import co.com.belatrix.test.application.SaveUrlContent;
import co.com.belatrix.test.domain.ports.PageRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {

    @Bean
    public SaveUrlContent saveUrlContent(final PageRepository pageRepository){
        return new SaveUrlContent(pageRepository);
    }
}
