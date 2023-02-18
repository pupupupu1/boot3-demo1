package com.pjm.boot3demo1.dao;

import com.pjm.boot3demo1.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao extends CrudRepository<UserInfo, Long> {

}
