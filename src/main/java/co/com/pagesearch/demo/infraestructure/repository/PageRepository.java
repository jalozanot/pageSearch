package co.com.pagesearch.demo.infraestructure.repository;

import co.com.pagesearch.demo.infraestructure.repository.entity.PageEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PageRepository extends ElasticsearchRepository<PageEntity, String> {
}
