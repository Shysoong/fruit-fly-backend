package org.jeecg.modules.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.demo.test.entity.JeecgOrderCustomer;
import org.jeecg.modules.demo.test.entity.JeecgOrderMain;
import org.jeecg.modules.demo.test.entity.JeecgOrderTicket;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 订单
 * @Author: jeecg-boot
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderMainService extends IService<JeecgOrderMain> {

	/**
	 * 添加一对多
	 * @param jeecgOrderMain 订单实体类
     * @param jeecgOrderCustomerList 订单客户集合
     * @param jeecgOrderTicketList 订单机票集合
	 */
	public void saveMain(JeecgOrderMain jeecgOrderMain,List<JeecgOrderCustomer> jeecgOrderCustomerList,List<JeecgOrderTicket> jeecgOrderTicketList) ;

	/**
	 * 修改一对多
     * @param jeecgOrderMain 订单实体类
     * @param jeecgOrderCustomerList 订单客户集合
     * @param jeecgOrderTicketList 订单机票集合
	 */
	public void updateMain(JeecgOrderMain jeecgOrderMain,List<JeecgOrderCustomer> jeecgOrderCustomerList,List<JeecgOrderTicket> jeecgOrderTicketList);

	/**
	 * 删除一对多
	 * @param id 订单id
	 */
	public void delMain (String id);

	/**
	 * 批量删除一对多
	 * @param idList 订单id集合
	 */
	public void delBatchMain (Collection<? extends Serializable> idList);

    /**
     * 修改一对多
     * @param jeecgOrderMain 订单实体类
     * @param jeecgOrderCustomerList 订单客户集合
     * @param jeecgOrderTicketList 订单机票集合
     */
	public void updateCopyMain(JeecgOrderMain jeecgOrderMain, List<JeecgOrderCustomer> jeecgOrderCustomerList, List<JeecgOrderTicket> jeecgOrderTicketList);
}
