## 模块
``` lua
listway
├── listway-ui -- 前端工程[8000]
├── listway-auth -- 授权服务提供[3000]
├── listway-common -- 系统公共模块 
├    ├── listway-common-core -- 公共工具类核心包
├    ├── listway-common-cache -- 缓存
├    ├── listway-common-job -- 定时任务
├    ├── listway-common-log -- 日志服务
├    └── listway-common-security -- 安全工具类
├    └── listway-common-swagger -- Swagger Api文档生成
├    └── listway-common-transaction -- 分布式事务工具包
├── listway-config -- 配置中心[8888]
├── listway-eureka -- 服务注册与发现[8761]
├── listway-gateway -- Spring Cloud Gateway网关[9999]
├── listway-upms -- 通用用户权限管理模块
├    └── listway-upms-api -- 通用用户权限管理系统公共api模块
├    └── listway-upms-biz -- 通用用户权限管理系统业务处理模块[4000]
└── listway-visual  -- 图形化模块 
├    ├── listway-monitor -- Spring Boot Admin监控 [5001]
├    ├── listway-daemon -- 分布式调度中心[5002]
├    └── listway-code-gen -- 图形化代码生成[5003]
├    └── listway-tx-manager -- pigx分布式事务解决方案[5004]
├    └── listway-activiti -- 工作流模块[5005]
	 
```
