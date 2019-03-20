package com.initcat.user.repository;

import com.initcat.user.model.db.CommUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.repository
 * @company initcat
 * @date 2018/11/26
 */
public interface CommUserRepository extends JpaRepository<CommUser, Long> {

    CommUser findByPhone(String userPhone);

    /*新建用户*/
    CommUser saveAndFlush(CommUser entity);
    /*完善用户信息*/
    CommUser update(CommUser entity);
}
