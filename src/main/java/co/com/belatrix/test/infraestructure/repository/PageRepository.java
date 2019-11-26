package co.com.belatrix.test.infraestructure.repository;

import co.com.belatrix.test.infraestructure.repository.entity.PageEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PageRepository extends ElasticsearchRepository<PageEntity, String> {
}
