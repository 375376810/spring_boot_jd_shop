package com.yxm.spring_boot_jd_shop.repository;

import com.yxm.spring_boot_jd_shop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2020/2/7
 * Time: 16:53
 * Description:
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();

    List<User> findAllByUserNameAndPassword(String userName, String password);

    List<User> findAllByUserName(String userName);
}