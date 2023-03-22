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
package org.jeecg.modules.scene.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jeecg.modules.scene.entity.Scene;
import org.jeecg.modules.scene.mapper.SceneMapper;
import org.jeecg.modules.scene.service.ISceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 场景业务实现类
 *
 * @author tony
 * @date 3/22/23 13:50
 */
@Service
public class SceneServiceImpl extends ServiceImpl<SceneMapper, Scene> implements ISceneService {
    @Autowired
    SceneMapper sceneMapper;
}
