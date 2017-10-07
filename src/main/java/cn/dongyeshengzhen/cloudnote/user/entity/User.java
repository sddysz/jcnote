package cn.dongyeshengzhen.cloudnote.user.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "content")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private Boolean is_active;
    private String pwd;
    private String username;
    private String usernameRaw;
    private Date createTime;

    // 用户头像
    private String logo;
    // 用户主题
    private String theme;

    //用户配置
    private Integer notebookWidth;
    private Integer noteListWidth;
    private Integer mdEditorWidth;
    private Integer leftIsMin;

    // 第三方登录
    private String thirdUserId;
    private String thirdUsername;
    private String thirdType;

    // 用户的账户类型
    private Integer imageNum;
    private Integer imageSize;
    private Integer attachNum;
    private Integer attachSize;
    private Integer fromUserId;

    private String accountType;
    private Date accountStartTime;
    private Date accountEndTime;

    // 阈值
    private Integer maxImageNum;
    private Integer maxImageSize;
    private Integer maxAttachNum;
    private Integer maxAttachSize;
    private Integer maxPerAttachSize;

    // updateSequenceNum,全局的
    private Integer usn;
    // 需要全量同步的时间，如果>客户端的LastSyncTime, 则需要全量更新
    private Boolean fullSyncBefore;


}
