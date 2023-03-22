/* ***************************************************************
 * Copyright (c) 2017-2019 Contributors.
 * All rights reserved.
 * This program and the accompanying materials can be used
 * in the case of Anycc authorization
 *
 * Contributors:
 *   AnyccTeam           Initial implementation
 * WebSite:
 *   http://www.anycc.com
 * **************************************************************/
package org.jeecg.modules.scene.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecg.common.system.base.entity.JeecgEntity;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * 场景实体
 *
 * @author tony
 * @date 2/15/23 21:27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "场景实体", description = "场景实体")
@TableName("fly_scene")
public class Scene extends JeecgEntity implements Serializable {
    private static final long serialVersionUID = 8997115462344495452L;
    /**
     * 场景名称
     */
    @ApiModelProperty(value = "场景名称")
    private String name;
    /**
     * 性状组合
     */
    @ApiModelProperty(value = "性状组合")
    private Set<String> characterCombination;
    /**
     * 浮动范围
     */
    @ApiModelProperty(value = "浮动范围")
    private Double floatRange;

    /**
     * 正确答案
     */
    @ApiModelProperty(value = "正确答案")
    private Map<String, Double> rightAnswer;

    /**
     * 部门编码
     */
    @ApiModelProperty(value = "部门编码")
    private String sysOrgCode;

}
