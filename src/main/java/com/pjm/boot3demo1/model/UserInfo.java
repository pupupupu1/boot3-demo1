package com.pjm.boot3demo1.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * <p>
 * 
 * </p>
 *
 * @author
 * @since 2022-07-28
 */
@Table("user_info")
public class UserInfo {

    public UserInfo(){

    }

    public UserInfo(Long userId, String phone){
        this.userId = userId;
        this.phone = phone;
    }

    @Id
    private Long userId;


    private String phone;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
