//package com.erp.pojo;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.util.Collection;
//import java.util.List;
//
//public class users implements UserDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String username;
//    private String password;
//    private String roles;
//    private boolean enable;
//    private List<GrantedAuthority> authorities;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRoles() {
//        return roles;
//    }
//
//    public void setRoles(String roles) {
//        this.roles = roles;
//    }
//
//    public boolean isEnable() {
//        return enable;
//    }
//
//    public void setEnable(boolean enable) {
//        this.enable = enable;
//    }
//
//    public void setAuthorities(List<GrantedAuthority> authorities) {
//        this.authorities = authorities;
//    }
//
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    public String getPassword() {
//        return null;
//    }
//
//    public String getUsername() {
//        return null;
//    }
//
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    public boolean isEnabled() {
//        return this.enable;
//    }
//}
