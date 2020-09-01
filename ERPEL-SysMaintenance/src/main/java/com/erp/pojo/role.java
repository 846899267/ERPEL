package com.erp.pojo;

import javax.persistence.Id;
import java.util.Date;

public class role {
    @Id
private Long id;
    private String  rolename;
    private Date createtime;
    private Long status;
    private Date authorizetime;
    private String authorizeusername;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getAuthorizetime() {
        return authorizetime;
    }

    public void setAuthorizetime(Date authorizetime) {
        this.authorizetime = authorizetime;
    }

    public String getAuthorizeusername() {
        return authorizeusername;
    }

    public void setAuthorizeusername(String authorizeusername) {
        this.authorizeusername = authorizeusername;
    }
}
