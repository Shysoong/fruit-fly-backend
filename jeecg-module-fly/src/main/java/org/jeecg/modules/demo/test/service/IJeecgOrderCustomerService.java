package org.jeecg.modules.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.demo.test.entity.JeecgOrderCustomer;

import java.util.List;

/**
 * @Description: 订单客户
 * @Author: jeecg-boot
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderCustomerService extends IService<JeecgOrderCustomer> {

    /**
     * 根据订单id获取订单客户数据
     * @param mainId 订单id
     * @return 订单顾客集合
     */
	public List<JeecgOrderCustomer> selectCustomersByMainId(String mainId);
}
