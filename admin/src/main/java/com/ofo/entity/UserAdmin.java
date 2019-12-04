package com.ofo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 系统管理员实体
 * createtime
 */
@Data
@TableName("user_admin")
public class UserAdmin implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    @ApiModelProperty(value = "用户ID标识",name = "id")
    private int userid;
    @ApiModelProperty(value = "用户账号",name = "useraccount")
    private String useraccount;
    @ApiModelProperty(value = "用户密码",name = "userpassword")
    private String userpassword;

    @Override
    public String toString() {
        return "UserAdmin{" +
                "userid=" + userid +
                ", useraccount='" + useraccount + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
