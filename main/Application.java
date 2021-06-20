package com.nashtechglobal.main;
import com.nashtechglobal.service.FileReaderService;
import com.nashtechglobal.service.PostService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.nashtechglobal.datamodel.Post;
import com.nashtechglobal.service.ulti.DateTimeUtils;

public class Application {
//	private static List<Post> posts = new ArrayList<>();
	
//	static{
//		posts.add(new Post(1, "Hoang","How to create java web","How to create a java web step by step", "Prepare...", LocalDate.now()));
//		
//		posts.add(new Post(2, "Long","How to create java application","How to create a java app step by step", "Prepare...", LocalDate.now()));
//	}
//	
//	
//
	public static void main(String[] args)
{
//		PostService postService = new PostService();
//		List<Post> postByName = postService.findByUsername(posts, "Long");
//		print(postByName);
//	}
	

		String convertDate = DateTimeUtils.convertDate("20210618", "yyyyMMdd", "ddMMyyyy");
		System.out.println(convertDate);
}	
		
	private static void print(List<Post> posts)
	{
		posts.stream().forEach(System.out::println);
	}
}
