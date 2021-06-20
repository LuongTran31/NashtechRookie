package com.nashtechglobal.service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.nashtechglobal.datamodel.Post;
import com.nashtechglobal.datamodel.author;

public class AuthorService {
	

	public Optional<author> findAuthorByUsername(List<author> authors, String username)
	{
			return authors.stream().filter(a->a.getUsername().equals(username)).findFirst();
	}
	public Optional<author> findAuthorByEmail (List<author> authors ,String email)
	{
		return authors.stream().filter(a->a.getEmail().equals(email)).findFirst();
	}
	
	public Set<String> findAllAuthorName(List<Post> posts)
	{
	return posts.stream().map(Post::getAuthor).collect(Collectors.toSet());
	}
}
