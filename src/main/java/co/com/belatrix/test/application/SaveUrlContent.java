package co.com.belatrix.test.application;

import co.com.belatrix.test.domain.Page;
import co.com.belatrix.test.domain.ports.PageRepository;


public class SaveUrlContent {

    private final PageRepository pageRepository;

    public SaveUrlContent(final PageRepository pageRepository){
        this.pageRepository = pageRepository;
    }
    public void handler(){
        Page page = new Page("www.google.com.co","<html>");
        this.pageRepository.savePage(page);
    }
}
