package com.study.model;

import javax.persistence.*;

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roleDesc")
    private String roledesc;

    @Column(name = "inProject")
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
     * @return roleDesc
     */
    public String getRoledesc() {
        return roledesc;
    }

    /**
     * @param roledesc
     */
    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    /**
     * @return inProject
     */
    public Integer getInproject() {
        return inproject;
    }

    /**
     * @param inproject
     */
    public void setInproject(Integer inproject) {
        this.inproject = inproject;
    }
}