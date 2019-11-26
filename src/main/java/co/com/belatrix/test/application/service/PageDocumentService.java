package co.com.belatrix.test.application.service;

import co.com.belatrix.test.domain.Page;
import co.com.belatrix.test.domain.ports.PageRepository;
import org.springframework.stereotype.Service;

@Service
public class PageDocumentService {

    private PageRepository pageRepository;

    public PageDocumentService(PageRepository pageRepository){
        this.pageRepository = pageRepository;
    }
    public void savePage(Page page) {

        this.pageRepository.savePage(page);
    }
}
