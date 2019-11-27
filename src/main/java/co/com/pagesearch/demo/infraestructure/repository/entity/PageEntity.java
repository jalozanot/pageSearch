package co.com.pagesearch.demo.infraestructure.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "page", type = "page")
@Data
public class PageEntity {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String url;

    @Field(type = FieldType.Text)
    private String content;

    public PageEntity(String url, String content){
        this.url = url;
        this.content = content;
    }
}
