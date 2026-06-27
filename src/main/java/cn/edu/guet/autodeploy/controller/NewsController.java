package cn.edu.guet.autodeploy.controller;

import cn.edu.guet.autodeploy.entity.News;
import cn.edu.guet.autodeploy.entity.Page;
import cn.edu.guet.autodeploy.mapper.NewsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsMapper newsMapper;

    /**
     * 分页查询全部新闻
     */
    @GetMapping("/newsList")
    public Page<News> newsList(int currentPage, int rows) {
        int start = (currentPage - 1) * rows;
        int total = newsMapper.newsCount();
        int totalPage = (total + rows - 1) / rows;

        Page<News> newsPage = new Page<>();
        newsPage.setTotal(total);
        newsPage.setTotalPage(totalPage);
        newsPage.setData(newsMapper.newsList(start, rows));
        return newsPage;
    }
    // NewsController.java
    @GetMapping("/getNewsById")
    public News getNewsById(@RequestParam Integer id) {
        return newsMapper.selectById(id); // MyBatis Plus 自带方法，无需写XML
    }
}