package com.yxm.spring_boot_jd_shop.repository;

import com.yxm.spring_boot_jd_shop.domain.OrderListItem;
import com.yxm.spring_boot_jd_shop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/6/7
 * Time: 16:33
 * Description:
 */
public interface OrderListItemRepository extends JpaRepository<OrderListItem,Long> {

    @Override
    List<OrderListItem> findAll();

    List<OrderListItem> findAllByUserId(Long userId);

}
