package org.gunanyi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * @Description: jeecg 测试demo 
 * @Author: jeecg-boot 
 * @Date:	2018-12-29 
 * @Version:V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="测试DEMO对象", description="测试DEMO")
@TableName("demo")
public class JeecgDemo extends Model<JeecgDemo> implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 部门编码 */
	@ApiModelProperty(value = "部门编码")
	private String sysOrgCode;
	/** 姓名 */
	@ApiModelProperty(value = "姓名")
	private String name;
	/** 关键词 */
	@ApiModelProperty(value = "关键词")
	private String keyWord;
	/** 打卡时间 */
	@ApiModelProperty(value = "打卡时间")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date punchTime;
	/** 工资 */
	@ApiModelProperty(value = "工资",example = "0")
	private java.math.BigDecimal salaryMoney;
	/** 奖金 */
	@ApiModelProperty(value = "奖金",example = "0")
	private Double bonusMoney;
	/** 性别 {男:1,女:2} */
	@ApiModelProperty(value = "性别")
	private String sex;
	/** 年龄 */
	@ApiModelProperty(value = "年龄",example = "0")
	private Integer age;
	/** 生日 */
	@ApiModelProperty(value = "生日")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date birthday;
	/** 邮箱 */
	@ApiModelProperty(value = "邮箱")
	private String email;
	/** 个人简介 */
	@ApiModelProperty(value = "个人简介")
	private String content;
}
