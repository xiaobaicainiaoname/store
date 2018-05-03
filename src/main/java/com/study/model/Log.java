package com.study.model;

import java.util.Date;
import javax.persistence.*;

public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 对应操作,0增加，1删除，2修改
     */
    private Integer operate;

    /**
     * 操作时间
     */
    private Date time;

    /**
     * 操作那张表
     */
    private String table;

    /**
     * 修改的时候旧的数据
     */
    @Column(name = "oldData")
    private String olddata;

    /**
     * 增删数据和修改后的数据
     */
    @Column(name = "newData")
    private String newdata;

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
     * 获取用户账号
     *
     * @return account - 用户账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户账号
     *
     * @param account 用户账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取对应操作,0增加，1删除，2修改
     *
     * @return operate - 对应操作,0增加，1删除，2修改
     */
    public Integer getOperate() {
        return operate;
    }

    /**
     * 设置对应操作,0增加，1删除，2修改
     *
     * @param operate 对应操作,0增加，1删除，2修改
     */
    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    /**
     * 获取操作时间
     *
     * @return time - 操作时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置操作时间
     *
     * @param time 操作时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取操作那张表
     *
     * @return table - 操作那张表
     */
    public String getTable() {
        return table;
    }

    /**
     * 设置操作那张表
     *
     * @param table 操作那张表
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * 获取修改的时候旧的数据
     *
     * @return oldData - 修改的时候旧的数据
     */
    public String getOlddata() {
        return olddata;
    }

    /**
     * 设置修改的时候旧的数据
     *
     * @param olddata 修改的时候旧的数据
     */
    public void setOlddata(String olddata) {
        this.olddata = olddata;
    }

    /**
     * 获取增删数据和修改后的数据
     *
     * @return newData - 增删数据和修改后的数据
     */
    public String getNewdata() {
        return newdata;
    }

    /**
     * 设置增删数据和修改后的数据
     *
     * @param newdata 增删数据和修改后的数据
     */
    public void setNewdata(String newdata) {
        this.newdata = newdata;
    }
}