package cn.dongyeshengzhen.framework.security.service;

import cn.dongyeshengzhen.framework.security.dao.UserDao;
import cn.dongyeshengzhen.framework.security.entity.User;
import cn.dongyeshengzhen.framework.utils.Digests;
import cn.dongyeshengzhen.framework.utils.EncodeUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户管理类
 *
 * @author yuqs
 * @since 0.1
 */
@Component
public class UserManager {
    public static final String HASH_ALGORITHM = "SHA-1";
    public static final int HASH_INTERATIONS = 1024;
    private static final int SALT_SIZE = 8;
    //注入用户持久化对象
    @Autowired
    private UserDao userDao;

    /**
     * 保存、更新用户实体
     *
     * @param entity
     */
    public void save(User entity) {
        if (StringUtils.isNotBlank(entity.getPassword())) {
            entryptPassword(entity);
        } else {
            User user = userDao.findOne(entity.getId());
            entity.setPassword(user.getPassword());
            entity.setSalt(user.getSalt());
        }
        userDao.save(entity);
    }

    /**
     * 根据主键ID删除对应的用户实体
     *
     * @param id
     */
    public void delete(Long id) {
        userDao.delete(id);
    }

    /**
     * 根据主键ID获取用户实体
     *
     * @param id
     * @return
     */
    public User get(Long id) {
        return userDao.findOne(id);
    }

    /**
     * 根据用户名称，获取用户实体
     *
     * @param username
     * @return
     */
    public User findUserByName(String username) {
        return userDao.findByUsername(username);
    }

    /**
     * 根据用户名判断是否唯一
     *
     * @param newUserName
     * @param oldUserName
     * @return
     */
    public boolean isUserNameUnique(String newUserName, String oldUserName) {
        int count = userDao.countByUsername(newUserName);
        if (count > 1) {
            return false;
        }
        return true;
    }


    /**
     * 查询所有记录
     *
     * @return
     */
    public List<User> getAll() {
        return userDao.findAll();
    }


    /**
     * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptPassword(User user) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        user.setSalt(EncodeUtils.hexEncode(salt));

        byte[] hashPassword = Digests.sha1(user.getPassword().getBytes(), salt, HASH_INTERATIONS);
        user.setPassword(EncodeUtils.hexEncode(hashPassword));
    }
}
