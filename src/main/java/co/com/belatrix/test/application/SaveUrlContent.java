package co.com.belatrix.test.application;

import co.com.belatrix.test.application.service.PageDocumentService;
import co.com.belatrix.test.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class SaveUrlContent {

    private PageDocumentService pageDocumentService;

    public SaveUrlContent(PageDocumentService pageDocumentService){
        this.pageDocumentService = pageDocumentService;
    }
    public void handler(){
        Page page = new Page("www.google.com.co","<html>");
        this.pageDocumentService.savePage(page);
    }
}
