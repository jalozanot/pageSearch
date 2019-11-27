package co.com.pagesearch.demo.domain.ports;

import co.com.pagesearch.demo.domain.Page;

public interface PageRepository {

    void savePage(Page page);
}
