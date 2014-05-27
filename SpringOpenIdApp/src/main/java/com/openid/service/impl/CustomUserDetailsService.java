package com.openid.service.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

/**
 * Created by akhilg on 27/5/14.
 */
public class CustomUserDetailsService implements UserDetailsService {

    Collection <? extends GrantedAuthority > authorities;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {


        try {
            /*

            Yet to determine this part***************************************
             */

            return new User(username, "", false,
                    false, false,
                    false,authorities );

        } catch (Exception e) {

            throw new UsernameNotFoundException("Error in retrieving user");


        }
    }
}
