package co.com.pagesearch.demo.application;

import co.com.pagesearch.demo.domain.Page;
import co.com.pagesearch.demo.domain.ports.PageRepository;


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
