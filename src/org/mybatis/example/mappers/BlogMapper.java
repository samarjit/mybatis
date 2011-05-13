package org.mybatis.example.mappers;

import java.util.List;

import org.mybatis.example.beans.Blog;
import org.mybatis.example.beans.Post;

public interface BlogMapper {
	List<Blog> selectBlog();
	List<Post> selectPosts(int idBlog);
}
