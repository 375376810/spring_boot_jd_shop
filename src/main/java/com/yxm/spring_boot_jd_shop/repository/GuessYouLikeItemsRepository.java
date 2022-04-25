package com.yxm.spring_boot_jd_shop.repository;

import com.yxm.spring_boot_jd_shop.domain.GuessYouLikeItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/5/14
 * Time: 18:15
 * Description:
 */
public interface GuessYouLikeItemsRepository extends JpaRepository<GuessYouLikeItems,Long> {

    @Override
    List<GuessYouLikeItems> findAll();
}
