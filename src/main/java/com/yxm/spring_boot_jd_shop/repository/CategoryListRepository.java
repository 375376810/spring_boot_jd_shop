package com.yxm.spring_boot_jd_shop.repository;

import com.yxm.spring_boot_jd_shop.domain.CategoryList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/25
 * Time: 17:58
 * Description:
 */
public interface CategoryListRepository extends JpaRepository<CategoryList,Long> {

    @Override
    List<CategoryList> findAll();


}
