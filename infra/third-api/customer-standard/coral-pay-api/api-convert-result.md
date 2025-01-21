# CoralPay API 文档的大模型解析

## CoralPay API 文档
[CoralPay API 文档](../../api-docs/CoralPay%20Interbank%20Payment%20(CIP)%20API%20Document%20v1.2.3-1_1.pdf)

## 提示词

CoralPay API文档中，是对API接口的描述。api-definition是一个期望的API格式。请将 CoralPay API文档中的内容，按照期望的API格式来输出。

要求：

请使用英来生成json。

输出格式是json，且仅保留json。

不可以更改期望格式中的json字段的名称。

In the CoralPay API documentation, there is a description of the API interface. api-definition is a desired API format. Please output the content from the CoralPay API documentation in the expected API format.

Requirements: 

Please generate the JSON using English. 

The output format is JSON, and only the JSON fields in the expected format should be retained. 

The desired format fields in JSON cannot be changed. Please translate into English.

## 标准结构
[API标准结构](../standard-definition/api-definition-v1.json)

## 其他影响因素

* Temperature
* TOP P
* TOP K

## 试验结果

### 通过Nova Pro生成的标准结构

* Temperature：0.1
* TOP P：0.1
* TOP K：0.1
* 指令：
  CoralPay API文档中，是对API接口的描述。api-definition是一个期望的API格式。请将 CoralPay API文档中的内容，按照期望的API格式来输出。
  要求：
  请使用英来生成json。
  输出格式是json，且仅保留json。
  不可以更改期望格式中的json字段的名称。
* 结果：
[生成的结果文件](api-result-with-nova.json)

### 通过 Claude 3.5 Haiku

* Temperature：0.1
* TOP P：0.1
* TOP K：0.1
* 指令：
  CoralPay API文档中，是对API接口的描述。api-definition是一个期望的API格式。请将 CoralPay API文档中的内容，按照期望的API格式来输出。
  要求：
  请使用英来生成json。
  输出格式是json，且仅保留json。
  不可以更改期望格式中的json字段的名称。
* 结果：
[生成的结果文件](api-result-with-claud.json)
* 发现的问题：
  * 第一次输出的是英文的json，后续输出是中文，通过提示词限制为英文，无效。

### 通过Meta Llama 3.3 70B Instruct v1

* Temperature：0.1
* TOP K：0.1
* 指令：
  CoralPay API文档中，是对API接口的描述。api-definition是一个期望的API格式。请将 CoralPay API文档中的内容，按照期望的API格式来输出。
  要求：
  请使用英来生成json。
  输出格式是json，且仅保留json。
  不可以更改期望格式中的json字段的名称。
* 结果：
[生成的结果文件](api-result-with-meta.json)
* 问题：
  response length 限制（2048），输出中断，未能完成完整的输出。

