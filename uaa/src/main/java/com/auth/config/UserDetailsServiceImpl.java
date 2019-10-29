package com.auth.config;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    public UserDetailsServiceImpl() {
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User("user", "$2a$10$jVLDXAcfrTRjdMAOtfsKReOUPRr2iAtp5BxG5ukI1j/eBGkNJPLFW", AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
    }
}
