# 通过AI助手来生成第三方API接入代码的生成

## 背景

在电商行业，有大量的物流公司，或者供应商要对接。以快递公司为例，如果直接对接快递公司，每家快递公司的接口协议会有差异，涉及到大量API调用的转换，以及认证方式和加解密的开发工作。
分发给不同快递公司的订单数据在业务上类似的，例如：

收件人：姓名，电话（隐私号码），地址；
快递明细：圆领T恤 黑色 XXL 2件；
寄件人：姓名，电话，地址；

![](./pic/overview%20for%20api%20converting.jpg)

## 需要解决的技术问题

* 能够识别API参数的含义，与标准参数做映射
* 能够识别API的技术协议，例如是HTTPS JSON，还是HTTPS XML等
* 能够识别加密解密算法
* 能够识别签名算法
* 能够识别API编排
    * 有些API是可以直接调用下单的
    * 有些API需要份两步，第一步获取一个单号，第二步，使用获取到的单号+业务参数下单
* 能够按照非业务约束来实现特性
    * 例如，记录日志，日志脱敏，控制超时时间等

## 期望实现的效果

* 能够根据标准快递单信息，生成测试用例，用来验证生成的转换代码是否达到预期的要求
* 通过给出API文档，能够生成相应的接口调用代码

## 通过标准中间结果桥接

问题清单， 尽可能使用选择题和是非题，如果是填空题，选择从文档中直接可以抓取的内容

* 这份API文档，是针对那种业务类型？请选择正确的答案
    * POS支付
    * 银行账户转账
    * 话费/流量充值
* 这份API文档描述的接口的baseURL是什么？请给出正确的答案
* 这份API文档描述的接口调用协议是什么？请给出正确的答案
    * HTTP
    * HTTPS
    * TCP/IP
    * 其他
* 是否使用了加解密算法？
* 加解密的算法是什么？
    * RSA
    * 其他

## 分段的好处

* 每一段，可以用不同的解决方案来解决问题，即便是都用大模型，也可以用不同的大模型解决。
* 即使是上一个环节的输出没有达到预期的效果，可以通过人工对结果的调整，作为下一个环节的标准输入，避免上一个环节的不准确性对下一个环节产生影响。
* 每个环节可以独立开发。

## 测试结果

### MTN API 文档的解析结果
[MTN API 文档解析.md](./infra/third-api/api-standard-json/mtn-api/api-convert-result.md)

### CoralPay API 文档的解析结果
[CoralPay API 文档解析.md](./infra/third-api/api-standard-json/coral-pay-api/api-convert-result.md)

## 通过大模型对解析结果打分
### 指令
coral-pay-api-nova.pdf，coral-pay-api-meta.pdf，coral-pay-api-claud.pdf 三个文档，是根据CoralPay的API文档，按照 api-definition-v2.pdf 生成的。请判断，这三个文档中，哪个文档是最符合要求，且最准确的，请给出文件名称。要求如下：
1.仅输出文档名称，无需输出判断过程。
2.如果匹配度得分满分是100分，最匹配的文档的得分是多少？
3.输出格式要求如下：{"fileName":"?","score":"?"}

### Nova的输出结果
{"fileName":"coral-pay-api-nova.pdf","score":"100"}
![img.png](pic/nova-evaluation.png)
### Claude的输出结果
{"fileName":"coral-pay-api-meta.pdf","score":"95"}
![img.png](pic/claude-evaluation.png)
