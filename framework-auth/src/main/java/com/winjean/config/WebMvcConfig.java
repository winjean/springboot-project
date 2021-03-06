package com.winjean.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//@Configuration
//@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

//    @Autowired
//    private RequestMappingHandlerAdapter handlerAdapter;


    //json返回值转换
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper objectMapper = jackson2HttpMessageConverter.getObjectMapper();
//
//        //默认不返回代理对象,即懒加载的对象
//        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
//
//        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
//            @Override
//            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
//                jsonGenerator.writeString("");
//            }
//        });
////        SimpleModule simpleModule = new SimpleModule();
////        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
////        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
////        objectMapper.registerModule(simpleModule);
//
//        jackson2HttpMessageConverter.setObjectMapper(objectMapper);
//        //放到第一个
//        converters.add(0, jackson2HttpMessageConverter);
//    }

//    @Bean
////    public HttpMessageConverter<String> responseBodyConverter() {
////        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
////        return converter;
////    }
////
////    @Override
////    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
////        super.configureMessageConverters(converters);
////        converters.add(responseBodyConverter());
////    }
////
////    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        //拦截规则：除了login，其他都拦截判断
//////        registry.addInterceptor(new UserLoginInterceptor()).addPathPatterns("/user/*").excludePathPatterns("/user/loginVerify");
////        super.addInterceptors(registry);
////    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
    }
}