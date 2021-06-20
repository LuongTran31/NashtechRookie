package com.nashtechglobal.service;
import com.nashtechglobal.datamodel.Authority;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AuthorityService {
	
	public List<String> findAuthorityByUsername(List<Authority> authorities, String username)
	{
		return authorities.stream().filter(authority->authority.getUsername().equals(username))
				.map(Authority::getAuthority).
				collect(Collectors.toList());
	}

}
