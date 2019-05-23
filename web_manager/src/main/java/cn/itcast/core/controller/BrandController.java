package cn.itcast.core.controller;

import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌管理
 * 品牌增删改查
 * @RestController注解作用: 相当于在类上加上@Controller注解, 然后这个类的所有方法的返回数据都会被自动转换成json格式字符串返回.
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll() {
        List<Brand> list = brandService.findAll();
        return list;
    }
}
