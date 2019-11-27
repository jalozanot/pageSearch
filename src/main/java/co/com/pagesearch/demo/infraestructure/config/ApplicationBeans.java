package co.com.pagesearch.demo.infraestructure.config;

import co.com.pagesearch.demo.application.SaveUrlContent;
import co.com.pagesearch.demo.domain.ports.PageRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {

    @Bean
    public SaveUrlContent saveUrlContent(final PageRepository pageRepository){
        return new SaveUrlContent(pageRepository);
    }
}
