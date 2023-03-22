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
package org.jeecg.modules.scene.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecg.modules.scene.entity.Scene;
import org.jeecg.modules.scene.service.ISceneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 场景Controller
 *
 * @author tony
 * @date 3/22/23 13:39
 */

@Slf4j
@Api(tags = "场景Controller")
@RestController
@RequestMapping("/scene")
public class SceneController extends JeecgController<Scene, ISceneService> {


}
