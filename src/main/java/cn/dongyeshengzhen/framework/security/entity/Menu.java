package cn.dongyeshengzhen.framework.security.entity;


import cn.dongyeshengzhen.portal.content.entity.ContentType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dongye on 2016/9/4.
 */
@Entity
@Table(name = "navigation")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String displayName;
    private Integer order;
    private String url;
    private Integer display_footer;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)//采用子查询抓取，避免1+n次查询
    @JoinColumn(name = "navId")
    @OrderBy(value = "orderId ASC,updateTime DESC")
    List<ContentType> contentTypeList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<ContentType> getContentTypeList() {
        return contentTypeList;
    }

    public void setContentTypeList(List<ContentType> contentTypeList) {
        this.contentTypeList = contentTypeList;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDisplay_footer() {
        return display_footer;
    }

    public void setDisplay_footer(Integer display_footer) {
        this.display_footer = display_footer;
    }
}
