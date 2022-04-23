package com.yxm.spring_boot_jd_shop.repository;

import com.yxm.spring_boot_jd_shop.domain.SwiperItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/22
 * Time: 22:18
 * Description:
 */
public interface SwiperItemsRepository extends JpaRepository<SwiperItems, Long> {

    @Override
    List<SwiperItems> findAll();

    @Override
    SwiperItems getOne(Long id);

    @Override
    <S extends SwiperItems> S saveAndFlush(S swiperItem);

}
