package com.yxm.spring_boot_jd_shop.repository;

import com.yxm.spring_boot_jd_shop.domain.HotProductItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/5/12
 * Time: 18:44
 * Description:
 */
public interface HotProductItemsRepository extends JpaRepository<HotProductItems,Long> {

    @Override
    List<HotProductItems> findAll();
}
