package com.nashtechglobal.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nashtechglobal.datamodel.Post;
import com.nashtechglobal.service.ulti.DateTimeUtils;

public class FileReaderService {
	public List<Post> readFile(String filePath)
	{
		
		try (Stream<String> lines = Files.lines(new File(filePath).toPath()))
		{ 
			//line
			return lines.map(line -> convertLine(line)).collect(Collectors.toList());
		} catch (IOException ex) {
			
			ex.printStackTrace();
			return new ArrayList<>();
		
		}
		
		
		
	}
	private Post convertLine(String line)
	{
		String[] properties = line.split("\\|");
		
		//Handle khi properties invalid format
		Post post = new Post();
		post.setAuthor(properties[0]);
		post.setTittle(properties[1]);
		post.setDescription(properties[3]);
		post.setContent(properties[4]);;
		post.setDate(DateTimeUtils.createDate(properties[4],"yyyyMMdd").toLocalDate());
		
		return post;
	}
}
