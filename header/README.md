![Logo](../doc/logo.png)

### 测试程序

[spring-boot-starter-header](https://github.com/IKangXu/spring-boot-starter-header)

### 准备工作

模拟头信息添加

```java
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        MutableHttpServletRequestWrapper wrapper = new MutableHttpServletRequestWrapper(request);
        wrapper.putHeader("testHeader", "ikangxu-header");

        filterChain.doFilter(wrapper, response);
    }
```

### 测试结果

首先运行 `eureka` 项目，保证注册中心正常运行。    
打开浏览器，访问`http://localhost:4101/`网址，出现以下页面，为正常启动

![Eureka正常启动](./feign/doc/img/img_01.png)

然后启动 `api`，默认端口`4201`

代码输出如下

```java
    @GetMapping("sayHello")
    public String sayHello(
            @RequestHeader(value = "testHeader", required = false) String testHeader,
            @RequestParam("testParam") String testParam
    ) {
        return new StringBuilder("testHeader=").append(testHeader)
                .append(";testParam=").append(testParam)
                .toString();
    }
```


> Feign测试

最后启动 `feign`，默认端口`4202`

打开浏览器，访问 `http://localhost:4202/feign/sayHello?testParam=111`，得到以下结果

![访问结果](./feign/doc/img/img_02.png)

> Ribbon测试

配置信息，让RestTemplate支持负载均衡

```java
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
```

输出代码

```java
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("sayHello")
    public String sayHello() {
        return restTemplate.getForEntity("http://header-api/api/sayHello?testParam=111", String.class).getBody();
    }
```

启动`rest`，默认端口`4203` 

打开浏览器，访问 `http://localhost:4203/feign/sayHello`，得到以下结果

![访问结果](./rest/doc/img/img_01.png)