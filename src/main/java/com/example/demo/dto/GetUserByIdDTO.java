package com.example.demo.dto;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 上午10:21:58 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Data
@ApiModel("测试-查询条件")
public class GetUserByIdDTO {
	@ApiModelProperty(value = "id标识值", required = true)
	@NotEmpty(message = "[userId值]不能为空")
	private String userId;
	@ApiModelProperty(value ="用户名")
	private String userName;
}
