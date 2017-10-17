package cn.dongyeshengzhen.cloudnote.notebook.entity;

import java.util.List;

public class NotebookNode {

    private Integer id;
    private String text;
    private List<NotebookNode> children;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<NotebookNode> getChildren() {
        return children;
    }

    public void setChildren(List<NotebookNode> children) {
        this.children = children;
    }
}
