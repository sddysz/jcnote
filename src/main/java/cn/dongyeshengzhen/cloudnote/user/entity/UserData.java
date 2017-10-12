package cn.dongyeshengzhen.cloudnote.user.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private Boolean isActive;
    private String pwd;
    //明文密码
    //salt
    private String salt;
    private String username;
    private String nickname;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsernameRaw() {
        return usernameRaw;
    }

    public void setUsernameRaw(String usernameRaw) {
        this.usernameRaw = usernameRaw;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getNotebookWidth() {
        return notebookWidth;
    }

    public void setNotebookWidth(Integer notebookWidth) {
        this.notebookWidth = notebookWidth;
    }

    public Integer getNoteListWidth() {
        return noteListWidth;
    }

    public void setNoteListWidth(Integer noteListWidth) {
        this.noteListWidth = noteListWidth;
    }

    public Integer getMdEditorWidth() {
        return mdEditorWidth;
    }

    public void setMdEditorWidth(Integer mdEditorWidth) {
        this.mdEditorWidth = mdEditorWidth;
    }

    public Integer getLeftIsMin() {
        return leftIsMin;
    }

    public void setLeftIsMin(Integer leftIsMin) {
        this.leftIsMin = leftIsMin;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getThirdUsername() {
        return thirdUsername;
    }

    public void setThirdUsername(String thirdUsername) {
        this.thirdUsername = thirdUsername;
    }

    public String getThirdType() {
        return thirdType;
    }

    public void setThirdType(String thirdType) {
        this.thirdType = thirdType;
    }

    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    public Integer getAttachNum() {
        return attachNum;
    }

    public void setAttachNum(Integer attachNum) {
        this.attachNum = attachNum;
    }

    public Integer getAttachSize() {
        return attachSize;
    }

    public void setAttachSize(Integer attachSize) {
        this.attachSize = attachSize;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getAccountStartTime() {
        return accountStartTime;
    }

    public void setAccountStartTime(Date accountStartTime) {
        this.accountStartTime = accountStartTime;
    }

    public Date getAccountEndTime() {
        return accountEndTime;
    }

    public void setAccountEndTime(Date accountEndTime) {
        this.accountEndTime = accountEndTime;
    }

    public Integer getMaxImageNum() {
        return maxImageNum;
    }

    public void setMaxImageNum(Integer maxImageNum) {
        this.maxImageNum = maxImageNum;
    }

    public Integer getMaxImageSize() {
        return maxImageSize;
    }

    public void setMaxImageSize(Integer maxImageSize) {
        this.maxImageSize = maxImageSize;
    }

    public Integer getMaxAttachNum() {
        return maxAttachNum;
    }

    public void setMaxAttachNum(Integer maxAttachNum) {
        this.maxAttachNum = maxAttachNum;
    }

    public Integer getMaxAttachSize() {
        return maxAttachSize;
    }

    public void setMaxAttachSize(Integer maxAttachSize) {
        this.maxAttachSize = maxAttachSize;
    }

    public Integer getMaxPerAttachSize() {
        return maxPerAttachSize;
    }

    public void setMaxPerAttachSize(Integer maxPerAttachSize) {
        this.maxPerAttachSize = maxPerAttachSize;
    }

    public Integer getUsn() {
        return usn;
    }

    public void setUsn(Integer usn) {
        this.usn = usn;
    }

    public Boolean getFullSyncBefore() {
        return fullSyncBefore;
    }

    public void setFullSyncBefore(Boolean fullSyncBefore) {
        this.fullSyncBefore = fullSyncBefore;
    }
}
