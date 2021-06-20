package com.nashtechglobal.service;
import com.nashtechglobal.datamodel.Post;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class PostService {
	public List<Post> findByUsername(List<Post> posts, String username)
	{
		//Assume post.getAuthor !=null
		return posts.stream().filter(p->p.getAuthor().equals(username)).collect(Collectors.toList()) ;
	}
	
	public List<Post> findTop10NewestPostbyUsername(List<Post> posts, String username)
	{
		return posts.stream().
				filter(p->p.getAuthor().equals(username)).
				sorted((p1, p2)->p2.getDate().
				compareTo(p1.getDate())).
				limit(10).
				collect(Collectors.toList());
	}
	public List<Post> findTop10NewestPost(List<Post> posts, String username,String keyword)
	{
		return posts.stream().
				filter(p->p.getAuthor().equals(username) && nullToEmpty(p.getContent()).contains(keyword)).
				sorted((p1, p2)->p2.getDate().
				compareTo(p1.getDate())).
				limit(10).
				collect(Collectors.toList());
	}
	
	public String nullToEmpty(String str)
	{
		return str != null ? str : "";
	}

	
	
	private int compare(LocalDate date1, LocalDate date2)
	{
		if(date1.isAfter(date2))
		{
			return 1;
		}else if(date1.isBefore(date2))
		{
			return -1;
		}
		return 0;
	}
	
	
	
	public List<Post> findByKeyWord(List<Post> posts, String keyword)
	{
		return posts.stream().filter(post->nullToEmpty(post.getTittle()).contains(keyword) || 
				nullToEmpty(post.getContent()).contains(keyword)).collect(Collectors.toList());
	}
	
	
	public Map<String,List<Post>> findPostByUserMap(List<Post> posts)
	{
//		Map<String, List<Post>> postUserMap = new HashMap<>();
//		for (Post post: posts)
//		{
//			String username = post.getAuthor();
//			if(postUserMap.containsKey(username))
//			{
//				postUserMap.get(username).add(post);
//			}else
//			{
//				List<Post> newPost = new ArrayList<>();
//				newPost.add(post);
//				postUserMap.put(username,newPost);
//			}
//		}
//		return postUserMap;
		
		return posts.stream().collect(Collectors.groupingBy(Post::getAuthor));
	}
	
	public List<Post> findPostToday(List<Post> posts)
	{
		return posts.stream().filter(p->p.getDate().equals(LocalDate.now())).collect(Collectors.toList());
	}
	
	public List<Post> findPostByAuthor(List<Post> posts, String username)
	{
		return posts.stream().filter(p->p.getAuthor().equals(username)).collect(Collectors.toList()) ;
	}
}
