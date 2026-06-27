package cn.edu.guet.autodeploy.entity;

import lombok.Data;

import java.util.Date;

@Data
public class News {
//    private Integer newsType;
//    private String newsTitle;
//    private String newsContent;
private Integer id;
    private String title;
    private String content;
    private Integer category;
    private String supplier;
    private String reviewer;
    private String status;
    private Date updateTime;
    private Date createTime;
    private Date publishTime;


}
