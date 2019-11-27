package co.com.pagesearch.demo.infraestructure.adapters;

import co.com.pagesearch.demo.domain.Page;
import co.com.pagesearch.demo.domain.ports.PageRepository;
import co.com.pagesearch.demo.infraestructure.repository.entity.PageEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ElasticSearchPageRepository implements PageRepository {

    private co.com.pagesearch.demo.infraestructure.repository.PageRepository pageRepository;

    public ElasticSearchPageRepository( final co.com.pagesearch.demo.infraestructure.repository.PageRepository pageRepository){
        this.pageRepository = pageRepository;
    }

    @Override
    public void savePage(Page page) {

        PageEntity pageEntity = new PageEntity(page.getUrl() , page.getContent());
        this.pageRepository.save(pageEntity);
    }
}
