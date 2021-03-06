/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.myth.admin.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * LogVO.
 *
 * @author xiaoyu(Myth)
 */
@Data
public class LogVO implements Serializable {

    private static final long serialVersionUID = 564418979137349581L;

    private String transId;

    private Integer retriedCount;

    private String createTime;

    private String lastTime;

    private Integer version;

    private String targetClass;

    private String targetMethod;

    private String errorMsg;

}
