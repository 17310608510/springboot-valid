@Valid注解用法详解+全局处理器Exception优雅处理参数验证用法


1. @Valid注解

注解 @Valid 的主要作用是用于数据效验，可以在定义的实体中的属性上，添加不同的注解来完成不同的校验规则，而在接口类中的接收数据参数中添加 @valid 注解，这时你的实体将会开启一个校验的功能。
2. @Valid 的相关注解

下面是 @Valid 相关的注解，在实体类中不同的属性上添加不同的注解，就能实现不同数据的效验功能

注解名称    作用描述
@Null   限制只能为null
@NotNull    限制必须不为null
@AssertFalse    限制必须为false
@AssertTrue 限制必须为true
@DecimalMax(value)  限制必须为一个不大于指定值的数字
@DecimalMin(value)  限制必须为一个不小于指定值的数字
@Digits(integer,fraction)   限制必须为一个小数，且整数部分的位数不能超过integer，小数部分的位数不能超过fraction
@Future 限制必须是一个将来的日期
@Max(value) 限制必须为一个不大于指定值的数字
@Min(value) 限制必须为一个不小于指定值的数字
@Past   限制必须是一个过去的日期
@Pattern(value) 限制必须符合指定的正则表达式
@Size(max,min)  限制字符长度必须在min到max之间
@Past   验证注解的元素值（日期类型）比当前时间早
@NotEmpty   验证注解的元素值不为null且不为空（字符串长度不为0、集合大小不为0）
@NotBlank   验证注解的元素值不为空（不为null、去除首位空格后长度为0），不同于@NotEmpty，@NotBlank只应用于字符串且在比较时会去除字符串的空格
@Email  验证注解的元素值是Email，也可以通过正则表达式和flag指定自定义的email格式