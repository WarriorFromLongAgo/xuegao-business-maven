# xuegao-business-maven
雪糕对于业务的理解


model-service
这个是当前项目使用的对象，do对象，
对外的对象，例如request，response（建议外部自己定义，但是有时候确实要微服务）
枚举能写在这里嘛，还是放在common里面，字段的校验可以在 business-service 重新做
common-service
常量，utils，responseCode等，对象的转换
单个业务，特殊的工具方法
abstract-service
抽象出来的方法，例如导入导出，
call-service
调用其他服务的方法
client-service
对外提供服务的方法
business-service
业务逻辑的方法，这里面还有
消息列队，定时任务