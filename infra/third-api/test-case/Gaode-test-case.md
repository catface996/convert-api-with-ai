## Gaode Maps Weather Information API 测试用例

### 主流程测试用例

#### 测试用例1：查询北京的实时天气信息
- **输入**:
    - `key`: 你的API Key
    - `city`: `Beijing`
- **预期输出**:
    - 状态码：`200`
    - 返回包含实时天气信息的JSON

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here&city=Beijing"
```

#### 测试用例2：查询北京的实时和预测天气信息（扩展模式）
- **输入**:
    - `key`: 你的API Key
    - `city`: `Beijing`
    - `extensions`: `all`
- **预期输出**:
    - 状态码：`200`
    - 返回包含实时和预测天气信息的JSON

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here&city=Beijing&extensions=all"
```

### 分支流程测试用例

#### 测试用例3：查询北京的实时天气信息（使用城市代码）
- **输入**:
    - `key`: 你的API Key
    - `city`: `010` (北京的城市代码)
- **预期输出**:
    - 状态码：`200`
    - 返回包含实时天气信息的JSON

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here&city=010"
```

#### 测试用例4：查询北京的实时天气信息（使用adcode）
- **输入**:
    - `key`: 你的API Key
    - `city`: `110100` (北京的adcode)
- **预期输出**:
    - 状态码：`200`
    - 返回包含实时天气信息的JSON

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here&city=110100"
```

### 异常流程测试用例

#### 测试用例5：缺少`key`参数
- **输入**:
    - `city`: `Beijing`
- **预期输出**:
    - 状态码：`403` 或其他错误码
    - 返回错误信息

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?city=Beijing"
```

#### 测试用例6：缺少`city`参数
- **输入**:
    - `key`: 你的API Key
- **预期输出**:
    - 状态码：`400` 或其他错误码
    - 返回错误信息

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here"
```

#### 测试用例7：使用无效的`city`参数
- **输入**:
    - `key`: 你的API Key
    - `city`: `InvalidCity`
- **预期输出**:
    - 状态码：`400` 或其他错误码
    - 返回错误信息

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here&city=InvalidCity"
```

#### 测试用例8：使用无效的`extensions`参数
- **输入**:
    - `key`: 你的API Key
    - `city`: `Beijing`
    - `extensions`: `invalid`
- **预期输出**:
    - 状态码：`400` 或其他错误码
    - 返回错误信息

```sh
curl "http://restapi.amap.com/v3/weather/weatherInfo?key=your_api_key_here&city=Beijing&extensions=invalid"
```

请确保将`your_api_key_here`替换为你的实际API Key。