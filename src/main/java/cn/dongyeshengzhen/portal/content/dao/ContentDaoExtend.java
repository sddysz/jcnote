package cn.dongyeshengzhen.portal.content.dao;

import cn.dongyeshengzhen.portal.content.entity.Content;

import java.util.List;

/**
 * Created by dongye on 2016/9/10.
 */
public interface ContentDaoExtend {
    List<Content> findContentByTypeId(Integer contentTypeId);
}
