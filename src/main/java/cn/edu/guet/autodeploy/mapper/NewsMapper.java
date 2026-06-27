package cn.edu.guet.autodeploy.mapper;

import cn.edu.guet.autodeploy.entity.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper extends BaseMapper<News> {
     void saveNews(News news);

     List<News> newsList(int start, int rows);

     int newsCount();

}
