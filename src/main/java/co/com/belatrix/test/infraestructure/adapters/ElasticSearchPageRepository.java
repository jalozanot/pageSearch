package co.com.belatrix.test.infraestructure.adapters;

import co.com.belatrix.test.domain.Page;
import co.com.belatrix.test.domain.ports.PageRepository;
import co.com.belatrix.test.infraestructure.repository.entity.PageEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ElasticSearchPageRepository implements PageRepository {

    private co.com.belatrix.test.infraestructure.repository.PageRepository pageRepository;

    public ElasticSearchPageRepository( final co.com.belatrix.test.infraestructure.repository.PageRepository pageRepository){
        this.pageRepository = pageRepository;
    }

    @Override
    public void savePage(Page page) {

        PageEntity pageEntity = new PageEntity(page.getUrl() , page.getContent());
        this.pageRepository.save(pageEntity);
    }
}
