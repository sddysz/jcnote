package cn.dongyeshengzhen.portal.news.dao;

import cn.dongyeshengzhen.portal.news.entity.News;
import org.springframework.data.jpa.domain.Specification;

/**
 * Created by dongye on 2016/8/25.
 */
public interface NewsDaoExtend {
    public Specification<News> getSpecification(Integer pageNumber,Integer type);
}
