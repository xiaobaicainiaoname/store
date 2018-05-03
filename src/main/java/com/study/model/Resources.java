package com.study.model;

import javax.persistence.*;

public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源url
     */
    @Column(name = "resUrl")
    private String resurl;

    /**
     * 资源描述
     */
    @Column(name = "resDesc")
    private String resdesc;

    /**
     * 标记所属工程。用户管理的功能按钮等资源不可删除)1不可删除
     */
    private Integer inproject;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资源url
     *
     * @return resUrl - 资源url
     */
    public String getResurl() {
        return resurl;
    }

    /**
     * 设置资源url
     *
     * @param resurl 资源url
     */
    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    /**
     * 获取资源描述
     *
     * @return resDesc - 资源描述
     */
    public String getResdesc() {
        return resdesc;
    }

    /**
     * 设置资源描述
     *
     * @param resdesc 资源描述
     */
    public void setResdesc(String resdesc) {
        this.resdesc = resdesc;
    }

    /**
     * 获取标记所属工程。用户管理的功能按钮等资源不可删除)1不可删除
     *
     * @return inproject - 标记所属工程。用户管理的功能按钮等资源不可删除)1不可删除
     */
    public Integer getInproject() {
        return inproject;
    }

    /**
     * 设置标记所属工程。用户管理的功能按钮等资源不可删除)1不可删除
     *
     * @param inproject 标记所属工程。用户管理的功能按钮等资源不可删除)1不可删除
     */
    public void setInproject(Integer inproject) {
        this.inproject = inproject;
    }
}