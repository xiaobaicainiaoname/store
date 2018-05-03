package com.study.model;

import javax.persistence.*;

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工程名
     */
    @Column(name = "projectName")
    private String projectname;

    /**
     * 服务的注册名
     */
    @Column(name = "serverName")
    private String servername;

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
     * 获取工程名
     *
     * @return projectName - 工程名
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * 设置工程名
     *
     * @param projectname 工程名
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    /**
     * 获取服务的注册名
     *
     * @return serverName - 服务的注册名
     */
    public String getServername() {
        return servername;
    }

    /**
     * 设置服务的注册名
     *
     * @param servername 服务的注册名
     */
    public void setServername(String servername) {
        this.servername = servername;
    }
}