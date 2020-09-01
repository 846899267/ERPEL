//package com.erp.service.impl;
//
//import com.erp.mapper.userMapper;
//import com.erp.pojo.users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class userService implements UserDetailsService {
//    @Autowired
//    private userMapper userMapper;
//
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//       users user=new users();
//       user.setUsername(s);
//       users userone= userMapper.selectOne(user);
//       if(userone==null){
//           throw new UsernameNotFoundException("用户不存在");
//       }
//       user.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(userone.getRoles()));
//       return user;
//    }
//}
