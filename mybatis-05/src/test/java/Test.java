import com.listron.dao.BlogMapper;
import com.listron.pojo.Blog;
import com.listron.utils.IDUtils;
import com.listron.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class Test {

@org.junit.Test
    public void testAddBlog(){
    SqlSession sqlSession = MyBatisUtils.getSqlSession();
    BlogMapper mapper=sqlSession.getMapper(BlogMapper.class);

    Blog blog = new Blog();
    blog.setId(IDUtils.getId());
    blog.setTitle("ajdhkafha");
    blog.setAuthor("zhangqiang");
    blog.setCreateTime(new Date());
    blog.setViews(9999);

    mapper.addBlog(blog);

    blog.setId(IDUtils.getId());
    blog.setTitle("uqiyequyq");
    blog.setAuthor("lisi");
    blog.setCreateTime(new Date());
    blog.setViews(10000);

    mapper.addBlog(blog);

    blog.setId(IDUtils.getId());
    blog.setTitle("asdfafasa");
    blog.setAuthor("wangwu");
    blog.setCreateTime(new Date());
    blog.setViews(10001);

    mapper.addBlog(blog);

    blog.setId(IDUtils.getId());
    blog.setTitle("rtwwetww");
    blog.setAuthor("liuyong");
    blog.setCreateTime(new Date());
    blog.setViews(10002);

    mapper.addBlog(blog);

    sqlSession.close();
}

}
